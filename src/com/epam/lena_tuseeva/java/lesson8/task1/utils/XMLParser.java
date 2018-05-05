package com.epam.lena_tuseeva.java.lesson8.task1.utils;

import com.epam.lena_tuseeva.java.lesson8.task1.models.Vegetable;
import com.epam.lena_tuseeva.java.lesson8.task1.models.Nutritive;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class XMLParser {

    public static Vegetable getVegetableByXML(File file, String vegetableName) {
        Vegetable vegetable = null;

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document document = dBuilder.parse(file);
            document.getDocumentElement().normalize();

            NodeList nList = document.getElementsByTagName("vegetable");
            for (int id = 0; id < nList.getLength(); id++) {
                Node nNode = nList.item(id);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;

                    if (getTextElement(element, "name").equals(vegetableName)) {
                        // Params
                        int calorific = XMLParser.parseElement(element, "calorific");
                        int proteins = XMLParser.parseElement(element, "proteins");
                        int fats = XMLParser.parseElement(element, "fats");
                        int carbohydrates = XMLParser.parseElement(element, "carbohydrates");
                        String vitamins = getTextElement(element, "vitamins");
                        String color = getTextElement(element, "color");
                        String wayForEating = getTextElement(element, "way_for_eating");

                        String nameOfVegetable = Helpers.getPathToClass(vegetableName);

                        Class<?> vegetableClass = Class.forName(nameOfVegetable);
                        Constructor<?> constructor = vegetableClass
                                .getDeclaredConstructor(Nutritive.class, String.class, String.class, String.class);

                        // Create classes
                        Nutritive nutritive = new Nutritive(calorific, proteins, fats, carbohydrates);
                        vegetable = (Vegetable) constructor.newInstance(nutritive, vitamins, color, wayForEating);
                    }
                }
            }
        } catch (ParserConfigurationException | IOException | InvocationTargetException |
                NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException |
                IllegalArgumentException | ClassNotFoundException | org.xml.sax.SAXException e) {
            e.printStackTrace();
        }

        return vegetable;
    }

    private static int parseElement(Element element, String tagName) {
        return Integer.parseInt(XMLParser.getTextElement(element, tagName));
    }

    private static String getTextElement(Element element, String tagName) {
        return element.getElementsByTagName(tagName).item(0).getTextContent();
    }
}
