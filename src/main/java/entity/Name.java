package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Name {

    public static String giveName() {

        List<String> name = new ArrayList<String>(Arrays.asList("Abbott", "Acevedo", "Acosta", "Adams", "Adkins", "Aguilar",
                "Aguirre", "Albert", "Alexander", "Alford','Allen", "Allison", "Alston", "Alvarado", "Alvarez",
                "Anderson", "Andrews", "Anthony", "Armstrong", "Arnold", "Ashley", "Atkins", "Atkinson", "Austin",
                "Avery", "Avila", "Ayala", "Ayers", "Bailey", "Baird", "Baker", "Baldwin", "Ball", "Ballard",
                "Banks", "Barber", "Barker", "Barlow", "Barnes", "Barnett", "Barr", "Barrera", "Barrett",
                "Barron", "Barry", "Bartlett", "Barton", "Bass", "Bates", "Battle", "Bauer", "Baxter", "Beach",
                "Bean", "Beard", "Beasley", "Beck", "Becker", "Bell", "Bender", "Benjamin", "Bennett", "Benson",
                "Bentley", "Benton", "Berg", "Berger", "Bernard", "Berry", "Best", "Bird", "Bishop", "Black",
                "Blackburn", "Blackwel", "Blair", "Blake", "Blanchard", "Blankenship", "Blevins", "Bolton",
                "Bond", "Bonner", "Booker", "Boone", "Booth", "Bowen", "Bowers", "Bowman", "Boyd",
                "Boyer", "Boyle", "Bradford", "Bradley", "Bradshaw", "Brady", "Branch", "Bray", "Brennan",
                "Brewer", "Bridges", "Briggs", "Bright", "Britt", "Brock", "Brooks", "Brown", "Browning", "Bruce",
                "Bryan", "Bryant", "Buchanan", "Buck", "Buckley", "Buckner", "Bullock", "Burch", "Burgess",
                "Burke", "Burks", "Burnett", "Burns", "Burris", "Burt", "Burton", "Bush", "Butler", "Byers",
                "Byrd", "Cabrera", "Cain", "Calderon", "Caldwell", "Calhoun", "Callahan", "Camacho",
                "Cameron", "Campbell", "Campos", "Cannon", "Cantrell", "Cantu"));

        Random ran = new Random();

        return name.get(ran.nextInt(name.size()));
    }

    public static String giveLastName(){

        List<String> lastName = new ArrayList<String>(Arrays.asList("Levine","Levy", "Lewis", "Lindsay", "Lindsey",
                "Little", "Livingston","Lloyd","Logan","Long","Lopez","Lott", "Love", "Lowe", "Lowery",  "Lucas", "Luna",
                "Lynch", "Lynn", "Lyons", "Macdonald", "Macia","Mack", "Madden", "Maddox","Maldonado","Malone", "Mann",
                "Manning", "Marks","Marquez","Marsh","Marshall","Martin", "Martinez", "Mason", "Massey", "Mathews",
                "Mathis","Matthews","Maxwell","May","Mayer","Maynard","Mayo","Mays","Mcbride","Mccall","Mccarthy",
                "Mccarty","Mcclain","Mcclure", "Mcconnell", "Mccormick", "Mccoy", "Mccray", "Mccullough","Mcdaniel",
                "Mcdonald","Mcdowell","Mcfadden","Mcfarland","Mcgee","Mcgowan","Mcguire","Mcintosh","Mcintyre","Mckay",
                "Mckee","Mckenzie","Mckinney","Mcknight","Mclaughlin","Mclean","Mcleod","Mcmahon","Mcmillan","Mcneil",
                "Mcpherson","Meadows", "Medina","Mejia","Melendez", "Melton","Mendez","Mendoza","Mercado","Mercer",
                "Merrill", "Merritt","Meyer","Meyers","Michael","Middleton","Miles","Miller","Mills","Miranda",
                "Mitchell","Molina","Monroe","Montgomery","Montoya","Moody","Moon","Mooney","Moore","Morales",
                "Moran","Moreno","Morgan","Morin","Morris","Morrison","Morrow","Morse","Morton","Moses","Mosley",
                "Moss","Mueller","Mullen","Mullins","Munoz","Murph","Murray","Myers","Nash", "Navarro"));

        Random ran = new Random();

        return lastName.get(ran.nextInt(lastName.size()));
    }
}

