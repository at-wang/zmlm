package com.example.zmlmcommon.utils;

import java.beans.PropertyDescriptor;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.commons.beanutils.converters.BigDecimalConverter;

public class DTOUtil {
    private static final PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();

    public DTOUtil() {
    }

    public void init() {
        BigDecimalConverter bd = new BigDecimalConverter((Object)null);
        ConvertUtils.register(bd, BigDecimal.class);
    }

    public static String getProperty(Object bean, String property) {
        String result = null;

        try {
            result = BeanUtils.getSimpleProperty(bean, property);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        return result;
    }

    public static void copyProperties(Object orig, Object dest) {
        copyProperties(orig, dest, true);
    }

    public static void copyProperties(Object orig, Object dest, String[] ignalString) {
        copyProperties(orig, dest, true, ignalString);
    }

    public static void copyProperties(Object orig, Object dest, boolean ignalNull) {
        DateFormat dateDf = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dateDf2 = new SimpleDateFormat("yyyyMMdd");
        DateFormat datetimeDf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat datetimeDft = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        try {
            if (orig != null && dest != null) {
                PropertyDescriptor[] origDescriptors = propertyUtilsBean.getPropertyDescriptors(dest);

                for(int i = 0; i < origDescriptors.length; ++i) {
                    String name = origDescriptors[i].getName();
                    if (!"class".equals(name) && propertyUtilsBean.isReadable(orig, name) && propertyUtilsBean.isWriteable(dest, name)) {
                        Object orig_value = propertyUtilsBean.getProperty(orig, name);
                        Class<?> dest_type = propertyUtilsBean.getPropertyType(dest, name);
                        if (orig_value != null || !ignalNull) {
                            if (dest_type != Timestamp.class && dest_type != Date.class && dest_type != java.util.Date.class || !"".equals(orig_value) && orig_value != null) {
                                if (dest_type != BigDecimal.class || !"".equals(orig_value)) {
                                    java.util.Date time;
                                    String value;
                                    if (dest_type == Timestamp.class) {
                                        time = null;
                                        value = orig_value.toString();
                                        if (value.indexOf("-") != -1) {
                                            if (value.length() > 10) {
                                                if (value.indexOf("T") > -1) {
                                                    time = datetimeDft.parse(orig_value.toString());
                                                } else {
                                                    time = datetimeDf.parse(orig_value.toString());
                                                }
                                            } else if (value.length() == 10) {
                                                time = dateDf.parse(orig_value.toString());
                                            }

                                            BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                                        } else if (value.length() == 8) {
                                            time = dateDf2.parse(orig_value.toString());
                                            BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                                        } else if (value.length() == 6) {
                                            time = dateDf2.parse(orig_value.toString() + "01");
                                            BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                                        } else if (value.length() == 4) {
                                            time = dateDf2.parse(orig_value.toString() + "0101");
                                            BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                                        } else {
                                            BeanUtils.copyProperty(dest, name, new Timestamp(Long.valueOf(value)));
                                        }
                                    } else if (dest_type == Date.class) {
                                        time = null;
                                        value = orig_value.toString();
                                        if (value.indexOf("-") != -1) {
                                            if (orig_value.toString().length() > 10) {
                                                if (value.indexOf("T") > -1) {
                                                    time = datetimeDft.parse(orig_value.toString());
                                                } else {
                                                    time = datetimeDf.parse(orig_value.toString());
                                                }
                                            } else if (value.length() == 10) {
                                                time = dateDf.parse(orig_value.toString());
                                            }

                                            BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                                        } else if (value.length() == 8) {
                                            time = dateDf2.parse(orig_value.toString());
                                            BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                                        } else if (value.length() == 6) {
                                            time = dateDf2.parse(orig_value.toString() + "01");
                                            BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                                        } else if (value.length() == 4) {
                                            time = dateDf2.parse(orig_value.toString() + "0101");
                                            BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                                        } else {
                                            BeanUtils.copyProperty(dest, name, new Date(Long.valueOf(value)));
                                        }
                                    } else if (dest_type == java.util.Date.class && propertyUtilsBean.getPropertyType(orig, name) != java.util.Date.class) {
                                        time = null;
                                        value = orig_value.toString();
                                        if (value.indexOf("-") != -1) {
                                            if (orig_value.toString().length() > 10) {
                                                time = datetimeDf.parse(orig_value.toString());
                                            } else if (value.length() == 10) {
                                                time = dateDf.parse(orig_value.toString());
                                            }

                                            BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                                        } else if (value.length() == 8) {
                                            time = dateDf2.parse(orig_value.toString());
                                            BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                                        } else if (value.length() == 6) {
                                            time = dateDf2.parse(orig_value.toString() + "01");
                                            BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                                        } else if (value.length() == 4) {
                                            time = dateDf2.parse(orig_value.toString() + "0101");
                                            BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                                        } else {
                                            BeanUtils.copyProperty(dest, name, new java.util.Date(Long.valueOf(value)));
                                        }
                                    } else {
                                        try {
                                            BeanUtils.copyProperty(dest, name, orig_value);
                                        } catch (Exception var14) {
                                            var14.printStackTrace();
                                        }
                                    }
                                }
                            } else {
                                propertyUtilsBean.setProperty(dest, name, (Object)null);
                            }
                        }
                    }
                }
            }
        } catch (Exception var15) {
            var15.printStackTrace();
        }

    }

    public static void copyProperties(Object orig, Object dest, boolean ignalNull, String[] ignalString) {
        DateFormat dateDf = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dateDf2 = new SimpleDateFormat("yyyyMMdd");
        DateFormat datetimeDf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat datetimeDft = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        try {
            if (orig != null && dest != null) {
                PropertyDescriptor[] origDescriptors = propertyUtilsBean.getPropertyDescriptors(dest);
                PropertyDescriptor[] var9 = origDescriptors;
                int var10 = origDescriptors.length;

                for(int var11 = 0; var11 < var10; ++var11) {
                    PropertyDescriptor descriptor = var9[var11];
                    List<String> ignalList = Arrays.asList(ignalString);
                    String name = descriptor.getName();
                    if (propertyUtilsBean.isReadable(orig, descriptor.getName()) && propertyUtilsBean.isWriteable(dest, descriptor.getName()) && !ignalList.contains(descriptor.getName())) {
                        Object orig_value = propertyUtilsBean.getProperty(orig, descriptor.getName());
                        Class<?> dest_type = propertyUtilsBean.getPropertyType(dest, descriptor.getName());
                        if (orig_value != null || !ignalNull) {
                            if (dest_type != Timestamp.class && dest_type != Date.class && dest_type != java.util.Date.class && dest_type != BigDecimal.class || !"".equals(orig_value) && orig_value != null) {
                                java.util.Date time;
                                String value;
                                if (dest_type == Timestamp.class) {
                                    time = null;
                                    value = orig_value.toString();
                                    if (value.indexOf("-") != -1) {
                                        if (value.length() > 10) {
                                            if (value.indexOf("T") > -1) {
                                                time = datetimeDft.parse(orig_value.toString());
                                            } else {
                                                time = datetimeDf.parse(orig_value.toString());
                                            }
                                        } else if (value.length() == 10) {
                                            time = dateDf.parse(orig_value.toString());
                                        }

                                        BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                                    } else if (value.length() == 8) {
                                        time = dateDf2.parse(orig_value.toString());
                                        BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                                    } else if (value.length() == 6) {
                                        time = dateDf2.parse(orig_value.toString() + "01");
                                        BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                                    } else if (value.length() == 4) {
                                        time = dateDf2.parse(orig_value.toString() + "0101");
                                        BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                                    } else {
                                        BeanUtils.copyProperty(dest, name, new Timestamp(Long.valueOf(value)));
                                    }
                                } else if (dest_type == Date.class) {
                                    time = null;
                                    value = orig_value.toString();
                                    if (value.indexOf("-") != -1) {
                                        if (orig_value.toString().length() > 10) {
                                            if (value.indexOf("T") > -1) {
                                                time = datetimeDft.parse(orig_value.toString());
                                            } else {
                                                time = datetimeDf.parse(orig_value.toString());
                                            }
                                        } else if (value.length() == 10) {
                                            time = dateDf.parse(orig_value.toString());
                                        }

                                        BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                                    } else if (value.length() == 8) {
                                        time = dateDf2.parse(orig_value.toString());
                                        BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                                    } else if (value.length() == 6) {
                                        time = dateDf2.parse(orig_value.toString() + "01");
                                        BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                                    } else if (value.length() == 4) {
                                        time = dateDf2.parse(orig_value.toString() + "0101");
                                        BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                                    } else {
                                        BeanUtils.copyProperty(dest, name, new Date(Long.valueOf(value)));
                                    }
                                } else if (dest_type == java.util.Date.class && propertyUtilsBean.getPropertyType(orig, name) != java.util.Date.class) {
                                    time = null;
                                    value = orig_value.toString();
                                    if (value.indexOf("-") != -1) {
                                        if (orig_value.toString().length() > 10) {
                                            time = datetimeDf.parse(orig_value.toString());
                                        } else if (value.length() == 10) {
                                            time = dateDf.parse(orig_value.toString());
                                        }

                                        BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                                    } else if (value.length() == 8) {
                                        time = dateDf2.parse(orig_value.toString());
                                        BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                                    } else if (value.length() == 6) {
                                        time = dateDf2.parse(orig_value.toString() + "01");
                                        BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                                    } else if (value.length() == 4) {
                                        time = dateDf2.parse(orig_value.toString() + "0101");
                                        BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                                    } else {
                                        BeanUtils.copyProperty(dest, name, new java.util.Date(Long.valueOf(value)));
                                    }
                                } else {
                                    try {
                                        BeanUtils.copyProperty(dest, name, orig_value);
                                    } catch (Exception var19) {
                                        var19.printStackTrace();
                                    }
                                }
                            } else {
                                propertyUtilsBean.setProperty(dest, name, (Object)null);
                            }
                        }
                    }
                }
            }
        } catch (Exception var20) {
            var20.printStackTrace();
        }

    }

    public static void copyPropertiesToString(Object orig, Object dest, boolean ignalNull) {
        DateFormat dateDf = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat datetimeDf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            if (orig != null && dest != null) {
                PropertyDescriptor[] origDescriptors = propertyUtilsBean.getPropertyDescriptors(dest);

                for(int i = 0; i < origDescriptors.length; ++i) {
                    String name = origDescriptors[i].getName();
                    if (!"class".equals(name) && propertyUtilsBean.isReadable(orig, name) && propertyUtilsBean.isWriteable(dest, name)) {
                        Object orig_value = propertyUtilsBean.getProperty(orig, name);
                        String orig_type = propertyUtilsBean.getPropertyType(orig, name).getName();
                        if (orig_value != null || !ignalNull) {
                            if (orig_type.equals("java.sql.Timestamp") && orig_value != null) {
                                BeanUtils.copyProperty(dest, name, datetimeDf.format((Timestamp)orig_value));
                            } else if (orig_type.equals("java.sql.Date") && orig_value != null) {
                                BeanUtils.copyProperty(dest, name, dateDf.format((Date)orig_value));
                            } else if (orig_type.equals("java.util.Date") && orig_value != null) {
                                BeanUtils.copyProperty(dest, name, dateDf.format((java.util.Date)orig_value));
                            } else {
                                try {
                                    BeanUtils.copyProperty(dest, name, orig_value);
                                } catch (Exception var11) {
                                    var11.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception var12) {
            var12.printStackTrace();
        }

    }

    public static void populateProperty(Object bean, String property, Object value) {
        try {
            String fieldtype = propertyUtilsBean.getPropertyType(bean, property).getName();
            if ((fieldtype.equals("java.sql.Timestamp") || fieldtype.equals("java.sql.Date") || fieldtype.equals("java.util.Date") || fieldtype.equals("java.math.BigDecimal")) && (value == null || "".equals(value)) && propertyUtilsBean.isReadable(bean, "modifyStrs") && propertyUtilsBean.isWriteable(bean, "modifyStrs")) {
                Object obj = propertyUtilsBean.getProperty(bean, "modifyStrs");
                if (obj instanceof List) {
                    List<String> list = (List)obj;
                    list.add(property);
                    value = null;
                }
            }

            BeanUtils.setProperty(bean, property, value);
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }

    public static void copySpecifyPropertys(Object orig, Object dest, String[] fieldNames) {
        DateFormat dateDf = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dateDf2 = new SimpleDateFormat("yyyyMMdd");
        DateFormat datetimeDf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat datetimeDft = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        try {
            if (dest == null || orig == null) {
                return;
            }

            for(int i = 0; i < fieldNames.length; ++i) {
                String name = fieldNames[i];
                Object orig_value = propertyUtilsBean.getProperty(orig, name);
                Class<?> dest_type = propertyUtilsBean.getPropertyType(dest, name);
                if (orig_value != null) {
                    if ((dest_type == Timestamp.class || dest_type == Date.class || dest_type == java.util.Date.class || dest_type == BigDecimal.class) && ("".equals(orig_value) || orig_value == null)) {
                        propertyUtilsBean.setProperty(dest, name, (Object)null);
                    } else {
                        java.util.Date time;
                        String value;
                        if (dest_type == Timestamp.class) {
                            time = null;
                            value = orig_value.toString();
                            if (value.indexOf("-") != -1) {
                                if (value.length() > 10) {
                                    if (value.indexOf("T") > -1) {
                                        time = datetimeDft.parse(orig_value.toString());
                                    } else {
                                        time = datetimeDf.parse(orig_value.toString());
                                    }
                                } else if (value.length() == 10) {
                                    time = dateDf.parse(orig_value.toString());
                                }

                                BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                            } else if (value.length() == 8) {
                                time = dateDf2.parse(orig_value.toString());
                                BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                            } else if (value.length() == 6) {
                                time = dateDf2.parse(orig_value.toString() + "01");
                                BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                            } else if (value.length() == 4) {
                                time = dateDf2.parse(orig_value.toString() + "0101");
                                BeanUtils.copyProperty(dest, name, new Timestamp(time.getTime()));
                            } else {
                                BeanUtils.copyProperty(dest, name, new Timestamp(Long.valueOf(value)));
                            }
                        } else if (dest_type == Date.class) {
                            time = null;
                            value = orig_value.toString();
                            if (value.indexOf("-") != -1) {
                                if (orig_value.toString().length() > 10) {
                                    time = datetimeDf.parse(orig_value.toString());
                                } else if (value.length() == 10) {
                                    time = dateDf.parse(orig_value.toString());
                                }

                                BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                            } else if (value.length() == 8) {
                                time = dateDf2.parse(orig_value.toString());
                                BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                            } else if (value.length() == 6) {
                                time = dateDf2.parse(orig_value.toString() + "01");
                                BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                            } else if (value.length() == 4) {
                                time = dateDf2.parse(orig_value.toString() + "0101");
                                BeanUtils.copyProperty(dest, name, new Date(time.getTime()));
                            } else {
                                BeanUtils.copyProperty(dest, name, new Date(Long.valueOf(value)));
                            }
                        } else if (dest_type == java.util.Date.class && propertyUtilsBean.getPropertyType(orig, name) != java.util.Date.class) {
                            time = null;
                            value = orig_value.toString();
                            if (value.indexOf("-") != -1) {
                                if (orig_value.toString().length() > 10) {
                                    time = datetimeDf.parse(orig_value.toString());
                                } else if (value.length() == 10) {
                                    time = dateDf.parse(orig_value.toString());
                                }

                                BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                            } else if (value.length() == 8) {
                                time = dateDf2.parse(orig_value.toString());
                                BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                            } else if (value.length() == 6) {
                                time = dateDf2.parse(orig_value.toString() + "01");
                                BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                            } else if (value.length() == 4) {
                                time = dateDf2.parse(orig_value.toString() + "0101");
                                BeanUtils.copyProperty(dest, name, new java.util.Date(time.getTime()));
                            } else {
                                BeanUtils.copyProperty(dest, name, new java.util.Date(Long.valueOf(value)));
                            }
                        } else {
                            try {
                                BeanUtils.copyProperty(dest, name, orig_value);
                            } catch (Exception var13) {
                                var13.printStackTrace();
                            }
                        }
                    }
                }
            }
        } catch (Exception var14) {
            var14.printStackTrace();
        }

    }

    public static void resetDTO(Object dto) {
        if (dto != null) {
            PropertyDescriptor[] origDescriptors = propertyUtilsBean.getPropertyDescriptors(dto);

            for(int i = 0; i < origDescriptors.length; ++i) {
                String name = origDescriptors[i].getName();
                if (propertyUtilsBean.isWriteable(dto, name) && !"class".equals(name)) {
                    try {
                        PropertyUtils.setSimpleProperty(dto, name, (Object)null);
                    } catch (Exception var5) {
                        var5.printStackTrace();
                    }
                }
            }

        }
    }

/*
    public static <T> Pagination copyPagination(Pagination orig, Class<T> clazz) {
        int totalCount = orig.getTotalCount();
        Pagination p = new Pagination(orig.getPageNo(), orig.getPageSize(), totalCount);
        if (totalCount < 1) {
            p.setList(new ArrayList());
            return p;
        } else {
            List<T> list = new ArrayList();
            List<?> origList = orig.getList();
            Iterator var6 = origList.iterator();

            while(var6.hasNext()) {
                Object o = var6.next();

                try {
                    Object d = clazz.newInstance();
                    copyProperties(o, d);
                    list.add(d);
                } catch (InstantiationException var9) {
                    var9.printStackTrace();
                } catch (IllegalAccessException var10) {
                    var10.printStackTrace();
                }
            }

            p.setList(list);
            return p;
        }
    }
*/

/*
    public static <T> List<T> copyList(List<? extends Object> origList, Class<T> clazz) {
        List<T> list = new ArrayList();
        if (null != origList && !origList.isEmpty()) {
            Iterator var3 = origList.iterator();

            while(var3.hasNext()) {
                Object o = var3.next();

                try {
                    Object d = clazz.newInstance();
                    copyProperties(o, d);
                    list.add(d);
                } catch (InstantiationException var6) {
                    var6.printStackTrace();
                } catch (IllegalAccessException var7) {
                    var7.printStackTrace();
                }
            }

            return list;
        } else {
            return list;
        }
    }
*/

    public static void copyPropertysIgnoreSpecify(Object orig, Object dest, String[] ignalString) {
        if (dest != null && orig != null) {
            try {
                if (orig != null && dest != null) {
                    PropertyDescriptor[] origDescriptors = propertyUtilsBean.getPropertyDescriptors(dest);
                    List list = new ArrayList();

                    for(int i = 0; i < origDescriptors.length; ++i) {
                        String name = origDescriptors[i].getName();
                        if (!"class".equals(name) && !stringArrayContain(ignalString, name) && propertyUtilsBean.isReadable(orig, name) && propertyUtilsBean.isWriteable(dest, name)) {
                            Object orig_value = propertyUtilsBean.getProperty(orig, name);
                            String dest_type = propertyUtilsBean.getPropertyType(dest, name).getName();
                            if (orig_value != null) {
                                if (!dest_type.equals("java.sql.Date") && !dest_type.equals("java.util.Date") && !dest_type.equals("java.math.BigDecimal") || !"".equals(orig_value) && orig_value != null) {
                                    try {
                                        BeanUtils.copyProperty(dest, name, orig_value);
                                    } catch (Exception var10) {
                                    }
                                } else {
                                    BeanUtils.copyProperty(dest, name, (Object)null);
                                    list.add(name);
                                }
                            }
                        }
                    }

                    if (propertyUtilsBean.isReadable(dest, "modifyStrs") && propertyUtilsBean.isWriteable(dest, "modifyStrs")) {
                        BeanUtils.copyProperty(dest, "modifyStrs", list);
                    }
                }
            } catch (Exception var11) {
                var11.printStackTrace();
            }

        }
    }

    public static boolean stringArrayContain(String[] array, String isContain) {
        String[] var2 = array;
        int var3 = array.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String str = var2[var4];
            if (str != null && str.equals(isContain)) {
                return true;
            }
        }

        return false;
    }

    public static void beanValueTrim(Object orig) {
        try {
            if (orig != null) {
                PropertyDescriptor[] origDescriptors = propertyUtilsBean.getPropertyDescriptors(orig);

                for(int i = 0; i < origDescriptors.length; ++i) {
                    String name = origDescriptors[i].getName();
                    if (propertyUtilsBean.isReadable(orig, name)) {
                        Object orig_value = propertyUtilsBean.getProperty(orig, name);
                        Class<?> dest_type = propertyUtilsBean.getPropertyType(orig, name);
                        if (orig_value != null && dest_type == String.class && !"".equals(orig_value) && orig_value != null && orig_value.toString().indexOf(" ") != -1) {
                            propertyUtilsBean.setProperty(orig, name, orig_value.toString().trim());
                        }
                    }
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }
}
