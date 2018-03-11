package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class DNAToRNAConversionTest {
    @Test
    public void testDna() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals(b.dnaToRna("TTTT"), b.dnaToRna("TTTT"), "UUUU");
    }

    @Test
    public void testDna2() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals(b.dnaToRna("GCAT"), b.dnaToRna("GCAT"), "GCAU");
    }

    @Test
    public void testDna3() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals(b.dnaToRna("GACCGCCGCC"), b.dnaToRna("GACCGCCGCC"), "GACCGCCGCC");
    }

    @Test
    public void testDna4() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals(b.dnaToRna("GATTCCACCGACTTCCCAAGTACCGGAAGCGCGACCAACTCGCACAGC"), b.dnaToRna("GATTCCACCGACTTCCCAAGTACCGGAAGCGCGACCAACTCGCACAGC"), "GAUUCCACCGACUUCCCAAGUACCGGAAGCGCGACCAACUCGCACAGC");
    }

    @Test
    public void testDna5() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals(b.dnaToRna("CACGACATACGGAGCAGCGCACGGTTAGTACAGCTGTCGGTGAACTCCATGACA"), b.dnaToRna("CACGACATACGGAGCAGCGCACGGTTAGTACAGCTGTCGGTGAACTCCATGACA"), "CACGACAUACGGAGCAGCGCACGGUUAGUACAGCUGUCGGUGAACUCCAUGACA");
    }

    @Test
    public void testDna6() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals(b.dnaToRna("CACGACATACGGAGCAGCGCACGGTTAGTACAGCTGTCGGTGAACTCCATGACA"), b.dnaToRna("CACGACATACGGAGCAGCGCACGGTTAGTACAGCTGTCGGTGAACTCCATGACA"), "CACGACAUACGGAGCAGCGCACGGUUAGUACAGCUGUCGGUGAACUCCAUGACA");
    }
    @Test
    public void testDna7() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals(b.dnaToRna("AACCCTGTCCACCAGTAACGTAGGCCGACGGGAAAAATAAACGATCTGTCAATG"), b.dnaToRna("AACCCTGTCCACCAGTAACGTAGGCCGACGGGAAAAATAAACGATCTGTCAATG"), "AACCCUGUCCACCAGUAACGUAGGCCGACGGGAAAAAUAAACGAUCUGUCAAUG");
    }

    @Test
    public void testDna8() throws Exception {
        DNAToRNAConversion b = new DNAToRNAConversion();
        assertEquals(b.dnaToRna("GAAGCTTATCCGTTCCTGAAGGCTGTGGCATCCTCTAAATCAGACTTGGCTACGCCGTTAGCCGAGGGCTTAGCGTTGAGTGTCATTATATACGCGGCCTGCGACCTGGCCACACAATGCCCTCGAAAATTTTTCTTTCGGTTATACGAGTTGCGAAACCTTTCGCGCGTAGACGAAGAATTTGAAGTGGCCTACACCGTTTGGAAAGCCGTTCTCATTAGAATGGTACCGACTACTCGGCTCGGAGTCATTGTATAGGGAGAGTGTCGTATCAACATCACACACTTTTAGCATTTAAGGTCCATGGCCGTTGACAGGTACCGA"), b.dnaToRna("GAAGCTTATCCGTTCCTGAAGGCTGTGGCATCCTCTAAATCAGACTTGGCTACGCCGTTAGCCGAGGGCTTAGCGTTGAGTGTCATTATATACGCGGCCTGCGACCTGGCCACACAATGCCCTCGAAAATTTTTCTTTCGGTTATACGAGTTGCGAAACCTTTCGCGCGTAGACGAAGAATTTGAAGTGGCCTACACCGTTTGGAAAGCCGTTCTCATTAGAATGGTACCGACTACTCGGCTCGGAGTCATTGTATAGGGAGAGTGTCGTATCAACATCACACACTTTTAGCATTTAAGGTCCATGGCCGTTGACAGGTACCGA"), "GAAGCUUAUCCGUUCCUGAAGGCUGUGGCAUCCUCUAAAUCAGACUUGGCUACGCCGUUAGCCGAGGGCUUAGCGUUGAGUGUCAUUAUAUACGCGGCCUGCGACCUGGCCACACAAUGCCCUCGAAAAUUUUUCUUUCGGUUAUACGAGUUGCGAAACCUUUCGCGCGUAGACGAAGAAUUUGAAGUGGCCUACACCGUUUGGAAAGCCGUUCUCAUUAGAAUGGUACCGACUACUCGGCUCGGAGUCAUUGUAUAGGGAGAGUGUCGUAUCAACAUCACACACUUUUAGCAUUUAAGGUCCAUGGCCGUUGACAGGUACCGA");
    }
}