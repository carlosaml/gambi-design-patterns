import org.xml.sax.SAXException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;

public class LoneWolf {

    public static int process(String file, int size, char type, Object[] status,
                                     int count, String query, String usr, String pwd,
                                     String db, String host, int day, int month, int year,
                                     int qtdSteps, int stepsMax, int maxDistance,
                                     String from, String to, Object... data)
            throws NullPointerException, ArrayIndexOutOfBoundsException,
            OutOfMemoryError, FileNotFoundException, SocketException, MalformedURLException,
            ArithmeticException, UnknownHostException, SAXException, ParseException,
            ClassNotFoundException, StackOverflowError, SQLException, IOException,
            InvocationTargetException, SecurityException, ClassCastException,
            NoSuchMethodException, NoSuchFieldException, UnsatisfiedLinkError,
            InstantiationException, ArrayStoreException, IllegalArgumentException,
            NumberFormatException, AssertionError, InternalError, RemoteException,
            RuntimeException, Exception, UnknownError, Error, Throwable {

        HashMap<String, Integer> rotes = new HashMap();
        int qtdRotes = 0;
        int distance = 0;
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new ArrayList<String>();

        Set<String> keys = rotes.keySet();
        for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
            String key = iterator.next();
            if (key.substring(0, 1).equals(from)) {
                list1.add(key);
            }
            if (key.substring(1, 2).equals(to)) {
                list2.add(key);
            }

            list3.add(key);

        }
        if ((qtdSteps == 1) || (stepsMax != 0 && stepsMax+1 >= 2)
                || maxDistance != 0) {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i).substring(1, 2).equals(to)
                        && list1.get(i).substring(0, 1).equals(from)) {
                    distance = rotes.get(list1.get(i));
                    if (maxDistance == 0) {
                        qtdRotes += 1;
                    } else if (distance < maxDistance) {
                        qtdRotes += 1;
                    }
                }

            }
        }
        if ((qtdSteps == 2) || (stepsMax != 0 && stepsMax+1 >= 3)
                || maxDistance != 0) {
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    if (list1.get(i).substring(1, 2)
                            .equals(list2.get(j).substring(0, 1))) {
                        distance = rotes.get(list1.get(i))
                                + rotes.get(list2.get(j));
                        if (maxDistance == 0) {
                            qtdRotes += 1;
                        } else if (distance < maxDistance) {
                            qtdRotes += 1;
                        }
                    }
                }
            }
        }
        if ((qtdSteps == 3) || (stepsMax != 0 && stepsMax+1 >= 4)
                || maxDistance != 0) {
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    for (int w = 0; w < list3.size(); w++) {

                        if (list1.get(i).substring(1, 2)
                                .equals(list3.get(w).substring(0, 1))
                                && list3.get(w).substring(1, 2)
                                .equals(list2.get(j).substring(0, 1))) {

                            distance = rotes.get(list1.get(i))
                                    + rotes.get(list3.get(w))
                                    + rotes.get(list2.get(j));

                            if (maxDistance == 0) {
                                qtdRotes += 1;
                            } else if (distance < maxDistance) {
                                qtdRotes += 1;
                            }
                        }
                    }
                }
            }
        }
        if ((qtdSteps == 4) || (stepsMax != 0 && stepsMax+1 >= 5)
                || maxDistance != 0) {
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    for (int w = 0; w < list3.size(); w++) {
                        for (int y = 0; y < list3.size(); y++) {
                            if (list1.get(i).substring(1, 2).equals(list3.get(w).substring(0, 1))
                                    && list3.get(w).substring(1, 2).equals(list3.get(y).substring(0, 1))
                                    && list3.get(y).substring(1, 2).equals(list2.get(j).substring(0, 1))) {

                                distance = rotes.get(list1.get(i))
                                        + rotes.get(list3.get(w))
                                        + rotes.get(list3.get(y))
                                        + rotes.get(list2.get(j));

                                if (maxDistance == 0) {
                                    qtdRotes += 1;
                                } else if (distance < maxDistance) {
                                    qtdRotes += 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        if ((qtdSteps == 5) || (stepsMax != 0 && stepsMax+1 >= 6)
                || maxDistance != 0) {
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    for (int w = 0; w < list3.size(); w++) {
                        for (int y = 0; y < list3.size(); y++) {
                            for (int t = 0; t < list3.size(); t++) {
                                if (list1.get(i).substring(1, 2).equals(list3.get(w).substring(0, 1))
                                        && list3.get(w).substring(1, 2).equals(list3.get(y).substring(0, 1))
                                        && list3.get(y).substring(1, 2).equals(list3.get(t).substring(0, 1))
                                        && list3.get(t).substring(1, 2).equals(list2.get(j).substring(0, 1))) {
                                    distance = rotes.get(list1.get(i))
                                            + rotes.get(list3.get(w))
                                            + rotes.get(list3.get(y))
                                            + rotes.get(list2.get(j))
                                            + rotes.get(list3.get(t));
                                    if (maxDistance == 0) {
                                        qtdRotes += 1;
                                    } else if (distance < maxDistance) {
                                        qtdRotes += 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if ((qtdSteps == 6) || (stepsMax != 0 && stepsMax+1 >= 7)
                || maxDistance != 0) {
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    for (int w = 0; w < list3.size(); w++) {
                        for (int y = 0; y < list3.size(); y++) {
                            for (int t = 0; t < list3.size(); t++) {
                                for (int v = 0; v < list3.size(); v++) {
                                    if (list1.get(i).substring(1, 2).equals(list3.get(w).substring(0, 1))
                                            && list3.get(w).substring(1, 2).equals(list3.get(y).substring(0, 1))
                                            && list3.get(y).substring(1, 2).equals(list3.get(t).substring(0, 1))
                                            && list3.get(t).substring(1, 2).equals(list3.get(v).substring(0, 1))
                                            && list3.get(v).substring(1, 2).equals(list2.get(j).substring(0, 1))) {
                                        distance = rotes.get(list1.get(i))
                                                + rotes.get(list3.get(w))
                                                + rotes.get(list3.get(y))
                                                + rotes.get(list2.get(j))
                                                + rotes.get(list3.get(t))
                                                + rotes.get(list3.get(v));
                                        if (maxDistance == 0) {
                                            qtdRotes += 1;
                                        } else if (distance < maxDistance) {
                                            qtdRotes += 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if ((qtdSteps == 7) || (stepsMax != 0 && stepsMax+1 >= 8)
                || maxDistance != 0) {
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    for (int w = 0; w < list3.size(); w++) {
                        for (int y = 0; y < list3.size(); y++) {
                            for (int t = 0; t < list3.size(); t++) {
                                for (int v = 0; v < list3.size(); v++) {
                                    for (int k = 0; k < list3.size(); k++) {
                                        if (list1.get(i).substring(1, 2).equals(list3.get(w).substring(0, 1))
                                                && list3.get(w).substring(1, 2).equals(list3.get(y).substring(0, 1))
                                                && list3.get(y).substring(1, 2).equals(list3.get(t).substring(0, 1))
                                                && list3.get(t).substring(1, 2).equals(list3.get(v).substring(0, 1))
                                                && list3.get(v).substring(1, 2).equals(list3.get(k).substring(0, 1))
                                                && list3.get(k).substring(1, 2).equals(list2.get(j).substring(0, 1))) {
                                            distance = rotes.get(list1.get(i))
                                                    + rotes.get(list3.get(w))
                                                    + rotes.get(list3.get(y))
                                                    + rotes.get(list2.get(j))
                                                    + rotes.get(list3.get(t))
                                                    + rotes.get(list3.get(v))
                                                    + rotes.get(list3.get(k));
                                            if (maxDistance == 0) {
                                                qtdRotes += 1;
                                            } else if (distance < maxDistance) {
                                                qtdRotes += 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if ((qtdSteps == 8) || (stepsMax != 0 && stepsMax+1 >= 9)
                || maxDistance != 0) {
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    for (int w = 0; w < list3.size(); w++) {
                        for (int y = 0; y < list3.size(); y++) {
                            for (int t = 0; t < list3.size(); t++) {
                                for (int v = 0; v < list3.size(); v++) {
                                    for (int k = 0; k < list3.size(); k++)
                                        for (int q = 0; q < list3.size(); q++){
                                            if (list1.get(i).substring(1, 2).equals(list3.get(w).substring(0, 1))
                                                    && list3.get(w).substring(1, 2).equals(list3.get(y).substring(0, 1))
                                                    && list3.get(y).substring(1, 2).equals(list3.get(t).substring(0, 1))
                                                    && list3.get(t).substring(1, 2).equals(list3.get(v).substring(0, 1))
                                                    && list3.get(v).substring(1, 2).equals(list3.get(k).substring(0, 1))
                                                    && list3.get(k).substring(1, 2).equals(list3.get(q).substring(0, 1))
                                                    && list3.get(q).substring(1, 2).equals(list2.get(j).substring(0, 1))) {
                                                distance = rotes.get(list1.get(i))
                                                        + rotes.get(list3.get(w))
                                                        + rotes.get(list3.get(y))
                                                        + rotes.get(list2.get(j))
                                                        + rotes.get(list3.get(t))
                                                        + rotes.get(list3.get(v))
                                                        + rotes.get(list3.get(k))
                                                        + rotes.get(list3.get(q));
                                                if (maxDistance == 0) {
                                                    qtdRotes += 1;
                                                } else if (distance < maxDistance) {
                                                    qtdRotes += 1;
                                                }
                                            }
                                        }
                                }
                            }
                        }
                    }
                }
            }
        }
        if ((qtdSteps == 9) || (stepsMax != 0 && stepsMax+1 >= 10)
                || maxDistance != 0) {
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    for (int w = 0; w < list3.size(); w++) {
                        for (int y = 0; y < list3.size(); y++) {
                            for (int t = 0; t < list3.size(); t++) {
                                for (int v = 0; v < list3.size(); v++) {
                                    for (int k = 0; k < list3.size(); k++)
                                        for (int q = 0; q < list3.size(); q++){
                                            for (int z = 0; z < list3.size(); z++){
                                                if (list1.get(i).substring(1, 2).equals(list3.get(w).substring(0, 1))
                                                        && list3.get(w).substring(1, 2).equals(list3.get(y).substring(0, 1))
                                                        && list3.get(y).substring(1, 2).equals(list3.get(t).substring(0, 1))
                                                        && list3.get(t).substring(1, 2).equals(list3.get(v).substring(0, 1))
                                                        && list3.get(v).substring(1, 2).equals(list3.get(k).substring(0, 1))
                                                        && list3.get(k).substring(1, 2).equals(list3.get(q).substring(0, 1))
                                                        && list3.get(q).substring(1, 2).equals(list3.get(z).substring(0, 1))
                                                        && list3.get(z).substring(1, 2).equals(list2.get(j).substring(0, 1))) {
                                                    distance = rotes.get(list1.get(i))
                                                            + rotes.get(list3.get(w))
                                                            + rotes.get(list3.get(y))
                                                            + rotes.get(list2.get(j))
                                                            + rotes.get(list3.get(t))
                                                            + rotes.get(list3.get(v))
                                                            + rotes.get(list3.get(k))
                                                            + rotes.get(list3.get(q))
                                                            + rotes.get(list3.get(z));
                                                    if (maxDistance == 0) {
                                                        qtdRotes += 1;
                                                    } else if (distance < maxDistance) {
                                                        qtdRotes += 1;
                                                    }
                                                }
                                            }
                                        }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (qtdRotes == 0) {
            throw new EmptyStackException();
        }
        return qtdRotes;
    }
}

