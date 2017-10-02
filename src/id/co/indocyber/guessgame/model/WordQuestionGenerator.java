/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class WordQuestionGenerator {

public static List<WordModel> createQuestionInCollection(){    
WordModel soal1 = new WordModel ("Pondok Indah","Daerah di Jakarta Selatan");
WordModel soal2 = new WordModel ("Sudirman","Jalan Utama di Jakarta");
WordModel soal3 = new WordModel ("Tugu Tani","Patung Dekat Monas");
WordModel soal4 = new WordModel ("Citos","Mall di Jakarta Selatan");
WordModel soal5 = new WordModel ("Gandaria City","Mall anak muda");
List <WordModel> bankSoal = new ArrayList();
        bankSoal.add(soal1); 
        bankSoal.add(soal2);
        bankSoal.add(soal3);
        bankSoal.add(soal4);
        bankSoal.add(soal5);
        return bankSoal;
}}
