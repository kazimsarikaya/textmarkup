/*
Text Markup Language
Copryright © 2014 Kazım SARIKAYA

This program is licensed under the terms of Sanal Diyar Software License. Please
read the license file or visit http://license.sanaldiyar.com
 */
package com.sanaldiyar.projects.textmarkup;

import com.sanaldiyar.projects.textmarkup.lang.ParseException;
import com.sanaldiyar.projects.textmarkup.lang.TextMarkupParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 *
 * @author kazim
 */
public class TextMarkup {

    public String parse(InputStream is) {
        try {
            return TextMarkupParser.parse(is);
        } catch (ParseException ex) {
            return null;
        }
    }

    public String parse(File file) {
        try {
            return TextMarkupParser.parse(file);
        } catch (FileNotFoundException | ParseException ex) {
            return null;
        }
    }

    public String parse(String data) {
        try {
            return TextMarkupParser.parse(data);
        } catch (ParseException ex) {
            return null;
        }
    }

}
