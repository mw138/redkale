/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redkale.source;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *
 * <pre>
 *     int   10万-100万     (36进制 4位)  255t - lflr    4-5长度  rewrite "^/dir/(\w+)/((\w{2})(\w{2})(\w?)\..*)$" /$1/$3/$2 last;            
 *     int  1000万-6000万   (36进制 5位)  5yc1t - zq0an
 *     int    2亿-20亿      (36进制 6位)  3b2ozl - x2qxvk   6-7长度  rewrite "^/dir/(\w+)/((\w{2})(\w{2})(\w{2})(\w?)\..*)$" /$1/$3/$4/$2 last;
 *    long   30亿-770亿     (36进制 7位)  1dm4etd - zdft88v
 *    long  1000亿-2万亿    (36进制 8位)  19xtf1tt - piscd0jj  8-9长度  rewrite "^/dir/(\w+)/((\w{2})(\w{2})(\w{2})(\w{2})(\w?)\..*)$" /$1/$3/$4/$5/$2 last;
 *    随机文件名:   (32进制 26位)   26-27长度    rewrite "^/dir/(\w+)/((\w{2})(\w{2})(\w{2})(\w{2})(\w{2})(\w{2})(\w{2})(\w{2})(\w{2})(\w{2})(\w{2})(\w{2})(\w{2})(\w?)\..*)$" /$1/$3/$4/$5/$6/$7/$8/$9/$10/$11/$12/$13/$14/$2 last;
 * </pre>
 *
 * <p>
 * 详情见: http://redkale.org
 *
 * @author zhangjx
 */
@Target({FIELD})
@Retention(RUNTIME)
public @interface DistributeGenerator {

    long initialValue() default 1;

    /**
     * 如果allocationSize的值小于或等于1,则主键不会加上nodeid
     *
     * @return allocationSize
     */
    int allocationSize() default 1000;
}
