package com.yunye.code.analyzeAndPrint;

import org.icepdf.core.pobjects.Document;
import icepdf.cr;
import java.lang.reflect.Field;
import org.icepdf.core.application.ProductInfo;
import org.icepdf.core.pobjects.Document;
/**
 * Created by 李凌耀 on 2017/6/5.
 */
public class MyDocument extends Document {
    public MyDocument() {
        Class clazzA = cr.class;
        Class clazzB = ProductInfo.class;

        try {
            Field name = clazzA.getDeclaredField("a");
            name.setAccessible(true);
            byte[] e = new byte[0];
            name.set(name, e);
            Field tip = clazzA.getDeclaredField("b");
            tip.setAccessible(true);
            tip.set(tip, e);
            Field ver_c = clazzB.getDeclaredField("c");
            Field ver_d = clazzB.getDeclaredField("d");
            Field ver_e = clazzB.getDeclaredField("e");
            Field ver_f = clazzB.getDeclaredField("f");
            ver_c.setAccessible(true);
            ver_d.setAccessible(true);
            ver_e.setAccessible(true);
            ver_f.setAccessible(true);
            ver_c.set(ver_c, "");
            ver_d.set(ver_d, "");
            ver_e.set(ver_e, "");
            ver_f.set(ver_f, "");
        } catch (NoSuchFieldException var10) {
            var10.printStackTrace();
        } catch (SecurityException var11) {
            var11.printStackTrace();
        } catch (IllegalArgumentException var12) {
            var12.printStackTrace();
        } catch (IllegalAccessException var13) {
            var13.printStackTrace();
        }

    }
}
