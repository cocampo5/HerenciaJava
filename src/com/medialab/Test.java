/*
 * Copyright (C) 2015 Cristóbal Ocampo Quintero
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.medialab;
/**
 *
 * @author Cristóbal
 */
public class Test {
    public Test(){
        
    }
    public static void main(String[] args){
        IngSistemas pregrado1 = new IngSistemas(0,"Ingenieria de Sistemas","Juan Perez");
        System.out.println("La carrera de "+pregrado1.getNombre()+" cuyo jefe de"
                + " carrera es  "+pregrado1.getJefeCarrera()+" posee "+pregrado1.getSalas()+" salas");
    }
}
