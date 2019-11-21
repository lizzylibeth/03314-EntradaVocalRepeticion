/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Variables
        char vocal;
        boolean logico = false;
        boolean valor = false;

        //Bucles de comprobacion
        do {
            do {
                try {

                    //Pedir dato
                    System.out.print("Vocal seleccionada ...: ");
                    vocal = SCN.nextLine().charAt(0);

                    //Comprobar si es un valor válido
                    logico = true;

                    //Condición. Comprobacion de dato correcto
                    if (vocal == 'A' || vocal == 'E' || vocal == 'I'
                            || vocal == 'O' || vocal == 'U') {

                        //Comprobar si es un valor correcto
                        valor = true;

                    } else {

                        //Mensaje de dato erróneo (debe ser vocal)
                        System.out.println("Ese carácter no es una vocal inglesa mayúscula");
                    }
                } catch (Exception e) {

                    //Mensaje de error
                    System.out.println("Lo sentimos, ese no era un carácter");
                }

            } while (!logico);
        } while (!valor);

    }//main

}//class
