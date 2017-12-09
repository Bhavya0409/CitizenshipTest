package com.example.bhavyashah.citizenshiptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questions {

    /**
     * ---------------------    AMERICAN GOVERNMENT    -------------------
     */

    /**
     * Principles of American Democracy
     */
    private static String QUESTION_1  = "What is the supreme law of the land";
    private static String QUESTION_2  = "What does the Constitution do?";
    private static String QUESTION_3  = "What are the first 3 words of the Constitution?";
    private static String QUESTION_4  = "What is an amendment?";
    private static String QUESTION_5  = "What do we call the first 10 amendments to the Constitution?";
    private static String QUESTION_6  = "What is one right of freedom from the First Amendment?";
    private static String QUESTION_7  = "How many amendments does the Constitution have?";
    private static String QUESTION_8  = "What did the Declaration of Independence do?";
    private static String QUESTION_9  = "What are two rights in the Declaration of Independence?";
    private static String QUESTION_10 = "What is freedom of religion?";
    private static String QUESTION_11 = "What is the economic system in the United States?";
    private static String QUESTION_12 = "What is the \"rule of law\"?";

    /**
     * System of Government
     */
    private static String QUESTION_13 = "Name one branch of government.";
    private static String QUESTION_14 = "What stops one branch of government from becoming too powerful?";
    private static String QUESTION_15 = "Who is in charge of the executive branch?";
    private static String QUESTION_16 = "Who makes federal laws?";
    private static String QUESTION_17 = "What are the two parts of the U.S. Congress?";
    private static String QUESTION_18 = "How many US senators are there?";
    private static String QUESTION_19 = "We elect a US senator for how long?";
    private static String QUESTION_20 = "Who is one of your state's US senators";
    private static String QUESTION_21 = "The House of Representatives has how many voting members?";
    private static String QUESTION_22 = "We elect a US representative for how many years?";
    private static String QUESTION_23 = "Name your US Representative?";
    private static String QUESTION_24 = "What does a US Senator represent?";
    private static String QUESTION_25 = "Why do some states have more Representatives than other states?";
    private static String QUESTION_26 = "We elect a President for how many years?";
    private static String QUESTION_27 = "In what month do we vote for the President?";
    private static String QUESTION_28 = "What is the name of the President of the United States now?";
    private static String QUESTION_29 = "What is the name of the Vice President of the United States now?";
    private static String QUESTION_30 = "If the President can no longer serve, who becomes president?";
    private static String QUESTION_31 = "If both the president and vice president can no longer serve, who becomes president?";
    private static String QUESTION_32 = "Who is the Commander in Chief of the military?";
    private static String QUESTION_33 = "Who signs bills to become law?";
    private static String QUESTION_34 = "Who vetoes bills?";
    private static String QUESTION_35 = "What does the President's Cabinet do?";
    private static String QUESTION_36 = "What are two Cabinet-level positions?";
    private static String QUESTION_37 = "What does the judicial branch do?";
    private static String QUESTION_38 = "What is the highest court in the United States?";
    private static String QUESTION_39 = "How many justices are on the Supreme Court?";
    private static String QUESTION_40 = "Who is the Chief Justice of the United States?";
    private static String QUESTION_41 = "The Constitution gives some powers to the federal government. What is one of these powers?";
    private static String QUESTION_42 = "The Constitution gives some powers to the states. What is one of these powers?";
    private static String QUESTION_43 = "Who is the Governor of your state now?";
    private static String QUESTION_44 = "What is the capital of your state?";
    private static String QUESTION_45 = "What are the two major political parties in the United States";
    private static String QUESTION_46 = "What is the political party of the President now?";
    private static String QUESTION_47 = "What is the name of the Speaker of the House of Representatives now?";

    /**
     * Rights and Responsibilities
     */
    private static String QUESTION_48 = "There are 4 amendments about who can vote. Describe one of them.";
    private static String QUESTION_49 = "What is one responsibility that is only for US citizens?";
    private static String QUESTION_50 = "Name one right only for US citizens.";
    private static String QUESTION_51 = "What are 2 rights of everyone living in the US?";
    private static String QUESTION_52 = "What do we show loyalty to when we say the Pledge of Allegiance?";
    private static String QUESTION_53 = "What is one promise you make when you become a US citizen?";
    private static String QUESTION_54 = "How old do citizens have to be to vote for President?";
    private static String QUESTION_55 = "What are 2 ways that Americans can participate in their democracy?";
    private static String QUESTION_56 = "When is the last day you can send in federal income tax forms?";
    private static String QUESTION_57 = "When must all men register for the Selective Service?";

    /**
     * ---------------------    AMERICAN HISTORY    -------------------
     */

    /**
     * Colonial Period and Independence
     */
    private static String QUESTION_58 = "What is one reason colonists came to America?";
    private static String QUESTION_59 = "Who lived in America before the Europeans arrived?";
    private static String QUESTION_60 = "What group of people was taken to America and sold to slaves?";
    private static String QUESTION_61 = "Why did the colonists fight the British?";
    private static String QUESTION_62 = "Who wrote the Declaration of Independence?";
    private static String QUESTION_63 = "When was the Declaration of Independence adopted?";
    private static String QUESTION_64 = "There were 13 original states. Name 3.";
    private static String QUESTION_65 = "What happened at the Constitutional Convention?";
    private static String QUESTION_66 = "When was the Constitution written?";
    private static String QUESTION_67 = "The Federalist Papers supported the passage of the US Constitution. Name one of the writers.";
    private static String QUESTION_68 = "What is one thing Benjamin Franklin is famous for?";
    private static String QUESTION_69 = "Who is the \"Father of Our Country\"?";
    private static String QUESTION_70 = "Who was the first President?";

    /**
     * 1800s
     */
    private static String QUESTION_71 = "What territory did the US buy from France in 1803?";
    private static String QUESTION_72 = "Name one war fought by the US in the 1800s.";
    private static String QUESTION_73 = "Name the US war between the North and South.";
    private static String QUESTION_74 = "Name one problem that led to the Civil War.";
    private static String QUESTION_75 = "What was one important thing that Abraham Lincoln did?";
    private static String QUESTION_76 = "What did the Emancipation Proclamation do?";
    private static String QUESTION_77 = "What did Susan B. Anthony do?";

    /**
     * Recent American History and Other Important Historical Information
     */
    private static String QUESTION_78 = "Name one war fought by the US in the 1900s";
    private static String QUESTION_79 = "Who was President during the World War I?";
    private static String QUESTION_80 = "Who was President during the Great Depression and World War II?";
    private static String QUESTION_81 = "Who did the US fight in World War II?";
    private static String QUESTION_82 = "Before he was President, Eisenhower was a general in what war?";
    private static String QUESTION_83 = "During the Cold War, what was the main concern of the United States?";
    private static String QUESTION_84 = "What movement tried to end racial discrimination?";
    private static String QUESTION_85 = "What did Martin Luther King Jr. do?";
    private static String QUESTION_86 = "What major event happened on September 11, 2001, in the US?";
    private static String QUESTION_87 = "Name one American Indian tribe in the US.";

    /**
     * ---------------------    INTEGRATED CIVICS    -------------------
     */

    /**
     * Geography
     */
    private static String QUESTION_88 = "Name one of the two longest rivers in the US.";
    private static String QUESTION_89 = "What ocean is on the west coast of the US?";
    private static String QUESTION_90 = "What ocean is on the east coast off the US?";
    private static String QUESTION_91 = "Name one US territory.";
    private static String QUESTION_92 = "Name one state that borders Canada.";
    private static String QUESTION_93 = "Name one state that borders Mexico.";
    private static String QUESTION_94 = "What is the capital of the US?";
    private static String QUESTION_95 = "Where is the Statue of Liberty?";

    /**
     * Symbols
     */
    private static String QUESTION_96  = "Why does the flag have 13 stripes?";
    private static String QUESTION_97  = "Why does the flag have 50 stars?";
    private static String QUESTION_98  = "What is the name of the national anthem?";
    private static String QUESTION_99  = "When do we celebrate Independence Day?";
    private static String QUESTION_100 = "Name 2 national US holidays.";

    /**
     * IDs of all the questions that are MC questions
     */
    public static final Integer[] multipleChoiceQuestions = new Integer[]{
            0, 6, 17, 18, 20, 21, 23, 25, 38, 53, 55, 56, 61, 64, 65, 81, 98
    };

    /**
     * IDs of all the questions that require one user input
     */
    public static final Integer[] oneAnswerQuestions = new Integer[]{
            1, 2, 3, 4, 5, 7, 9, 10, 11, 12, 13, 14, 15, 19, 22, 24, 26, 27, 28, 29, 30, 31, 32, 33, 34, 36, 37, 39, 40, 41, 42, 43, 45, 46, 47, 48, 49, 51, 52,
            57, 58, 59, 60, 62, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97
    };

    /**
     * IDs of all the questions that require two user inputs
     */
    public static final Integer[] twoAnswersQuestions = new Integer[]{
            8, 16, 35, 44, 50, 54, 99
    };

    /**
     * IDs of all the questions that require three user inputs
     */
    public static final Integer[] threeAnswersQuestions = new Integer[]{
            63, 80
    };

    /**
     * If the question is a user-input question, return a 2D array of keywords for a certain question
     * since all the keywords in one set have to match, but only one set has to match (OR the sets, but AND everything inside the sets)
     *
     * @param question question ID
     * @return return 2D array of keywords
     */
    public static final String[][] getKeywords(int question) {
        switch (question) {
            case 1:
                return new String[][]{{"set", "government"}, {"define", "government"}, {"protect", "basic", "right", "americans"}};
            case 2:
                return new String[][]{{"we", "the", "people"}};
            case 3:
                return new String[][]{{"change"}, {"addition"}};
            case 4:
                return new String[][]{{"bill", "of", "rights"}};
            case 5:
                return new String[][]{{"speech"}, {"religion"}, {"assembly"}, {"press"}, {"petition", "government"}};
            case 7:
                return new String[][]{{"announce", "independence"}, {"declare", "independence"}, {"united", "states", "free"}};
            case 8:
                return new String[][]{{"life"}, {"liberty"}, {"pursuit", "happiness"}};
            case 9:
                return new String[][]{{"practice", "any", "religion"}};
            case 10:
                return new String[][]{{"capitalist", "economy"}, {"market", "economy"}, {"capitalism"}};
            case 11:
                return new String[][]{{"everyone", "follow", "law"}, {"leader", "obey", "law"}, {"government", "obey", "law"}, {"no", "one", "above", "law"}};
            case 12:
                return new String[][]{{"congress"}, {"legislative"}, {"president"}, {"executive"}, {"courts"}, {"judicial"}};
            case 13:
                return new String[][]{{"checks", "and", "balances"}, {"separation", "of", "powers"}};
            case 14:
                return new String[][]{{"president"}};
            case 15:
                return new String[][]{{"congress"}, {"senate", "house", "of", "representatives"}, {"legislature"}};
            case 16:
                return new String[][]{{"senate"}, {"house", "representatives"}};
            case 19:
                return new String[][]{{"cory", "booker"}, {"bob", "menendez"}};
            case 22:
                return new String[][]{{"frank", "pallone"}, {"leonard", "lance"}, {"bonnie", "watson", "coleman"}};
            case 24:
                return new String[][]{{"state", "population"}, {"more", "people"}, {"some", "states", "more", "people"}};
            case 26:
                return new String[][]{{"november"}};
            case 27:
                return new String[][]{{"trump"}};
            case 28:
                return new String[][]{{"pence"}};
            case 29:
                return new String[][]{{"vice", "president"}};
            case 30:
                return new String[][]{{"speaker", "of", "house"}};
            case 31:
                return new String[][]{{"president"}};
            case 32:
                return new String[][]{{"president"}};
            case 33:
                return new String[][]{{"president"}};
            case 34:
                return new String[][]{{"advise"}};
            case 35:
                return new String[][]{{"secretary", "agriculture"}, {"secretary", "commerce"}, {"secretary", "defense"}, {"secretary", "education"},
                        {"secretary", "energy"}, {"secretary", "health", "human", "services"}, {"secretary", "homeland", "security"},
                        {"secretary", "housing", "urban", "development"}, {"secretary", "interior"}, {"secretary", "labor"},
                        {"secretary", "state"}, {"secretary", "transportation"}, {"secretary", "treasury"}, {"secretary", "veteran", "affairs"},
                        {"attorney", "general"}, {"vice", "president"}};
            case 36:
                return new String[][]{{"review", "law"}, {"explain", "law"}, {"resolve", "dispute"}, {"decide", "law", "against", "constitution"}};
            case 37:
                return new String[][]{{"supreme", "court"}};
            case 39:
                return new String[][]{{"john", "roberts"}};
            case 40:
                return new String[][]{{"print", "money"}, {"declare", "war"}, {"create", "army"}, {"make", "treaties"}};
            case 41:
                return new String[][]{{"school", "education"}, {"protection"}, {"safety"}, {"driver", "license"}, {"zoning", "land", "use"}};
            case 42:
                return new String[][]{{"chris", "christie"}, {"phil", "murphy"}};
            case 43:
                return new String[][]{{"trenton"}};
            case 44:
                return new String[][]{{"democrat"}, {"republican"}};
            case 45:
                return new String[][]{{"republican"}};
            case 46:
                return new String[][]{{"paul", "ryan"}};
            case 47:
                return new String[][]{{"18", "older", "vote"}, {"eighteen", "older", "vote"},
                        {"don't", "pay", "to", "vote"}, {"any", "citizen", "can", "vote"}, {"women", "men", "can", "vote"},
                        {"male", "citizen", "any", "race"}};
            case 48:
                return new String[][]{{"serve", "jury"}, {"vote", "federal", "election"}};
            case 49:
                return new String[][]{{"vote", "federal", "election"}, {"run", "federal", "office"}};
            case 50:
                return new String[][]{{"freedom", "expression"}, {"freedom", "speech"}, {"freedom", "assembly"}, {"freedom", "petition", "government"},
                        {"freedom", "religion"}, {"right", "bear", "arms"}};
            case 51:
                return new String[][]{{"united", "states"}, {"us"}, {"u.s."}, {"flag"}};
            case 52:
                return new String[][]{{"give", "up", "loyalty", "other", "countries"},
                        {"defend", "constitution", "laws"}, {"obey", "law"}, {"serve", "military"}, {"serve", "nation"}, {"loyal", "united", "states"}};
            case 54:
                return new String[][]{{"vote"}, {"join", "political", "party"}, {"help", "campaign"}, {"join", "civic", "group"},
                        {"join", "community", "group"}, {"give", "official", "opinion"}, {"call", "senators", "representatives"},
                        {"run", "office"}, {"write", "newspaper"}};
            case 57:
                return new String[][]{{"freedom"}, {"political", "liberty"},
                        {"religious", "freedom"}, {"economic", "opportunity"}, {"practice", "religion"}, {"escape", "persecution"}};
            case 58:
                return new String[][]{{"american", "indians"}, {"native", "americans"}};
            case 59:
                return new String[][]{{"africans"}, {"people", "from", "africa"}};
            case 60:
                return new String[][]{{"high", "taxes"}, {"army", "stayed", "in", "houses"}, {"boarding"}, {"quartering"}, {"self-government"}};
            case 62:
                return new String[][]{{"july", "4", "1776"}};
            case 63:
                return new String[][]{{"new", "hampshire"}, {"massachusetts"}, {"rhode", "island"},
                        {"connecticut"}, {"new", "york"}, {"new", "jersey"}, {"pennsylvania"}, {"delaware"}, {"maryland"}, {"virginia"},
                        {"north", "carolina"}, {"south", "carolina"}, {"georgia"}};
            case 66:
                return new String[][]{{"madison"}, {"hamilton"}, {"jay"}, {"publius"}};
            case 67:
                return new String[][]{{"diplomat"}, {"oldest", "constitutional", "convention"}, {"first", "postmaster", "general"},
                        {"write", "poor", "richard", "almanac"}, {"first", "free", "libraries"}};
            case 68:
                return new String[][]{{"washington"}};
            case 69:
                return new String[][]{{"washington"}};
            case 70:
                return new String[][]{{"louisiana"}};
            case 71:
                return new String[][]{{"war", "1812"}, {"mexican", "american"}, {"civil"}, {"spanish", "american"}};
            case 72:
                return new String[][]{{"civil"}, {"between", "states"}};
            case 73:
                return new String[][]{{"slavery"}, {"economic"}, {"states", "rights"}};
            case 74:
                return new String[][]{{"free", "slaves"},{"freedom", "slaves"}, {"saved", "union"}, {"led", "united", "states", "during", "civil", "war"}};
            case 75:
                return new String[][]{{"free", "slaves"}};
            case 76:
                return new String[][]{{"fought", "women", "rights"}, {"fought", "civil", "rights"}};
            case 77:
                return new String[][]{{"world"}, {"korean"}, {"vietnam"}, {"gulf"}};
            case 78:
                return new String[][]{{"wilson"}};
            case 79:
                return new String[][]{{"roosevelt"}, {"fdr"}};
            case 80:
                return new String[][]{{"japan"}, {"germany"}, {"italy"}};
            case 82:
                return new String[][]{{"communism"}};
            case 83:
                return new String[][]{{"civil", "rights"}};
            case 84:
                return new String[][]{{"fought", "civil", "rights"}, {"worked", "for", "equality"}};
            case 85:
                return new String[][]{{"terrorists"}, {"terrorism"}};
            case 86:
                return new String[][]{{"cherokee"}, {"navajo"}, {"sioux"}, {"chippewa"}, {"choctaw"},
                        {"pueblo"}, {"apache"}, {"iroquois"}, {"creek"}, {"blackfeet"}, {"seminole"},
                        {"cheyenne"}, {"arawak"}, {"shawnee"}, {"mohegan"}, {"huron"}, {"oneida"},
                        {"lakota"}, {"crow"}, {"teton"}, {"hopi"}, {"inuit"}};
            case 87:
                return new String[][]{{"missouri"}, {"mississippi"}};
            case 88:
                return new String[][]{{"pacific"}};
            case 89:
                return new String[][]{{"atlantic"}};
            case 90:
                return new String[][]{{"puerto", "rico"}, {"virgin", "islands"}, {"american", "samoa"}, {"northern", "mariana", "islands"}, {"guam"}};
            case 91:
                return new String[][]{{"maine"}, {"new", "hampshire"}, {"vermont"}, {"new", "york"},
                        {"pennsylvania"}, {"ohio"}, {"michigan"}, {"minnesota"}, {"north", "dakota"}, {"montana"}, {"idaho"}, {"washington"}, {"alaska"}};
            case 92:
                return new String[][]{{"california"}, {"arizona"}, {"new", "mexico"}, {"texas"}};
            case 93:
                return new String[][]{{"washington", "d", "c"}};
            case 94:
                return new String[][]{{"new", "york"}, {"liberty", "island"}, {"new", "jersey"}};
            case 95:
                return new String[][]{{"original", "colonies"}};
            case 96:
                return new String[][]{{"one", "each", "state"}, {"each", "star", "represent", "state"}, {"50", "states"}, {"fifty", "states"}};
            case 97:
                return new String[][]{{"star", "spangled", "banner"}};
            case 99:
                return new String[][]{{"new", "year"}, {"martin", "luther", "king"}, {"president"}, {"memorial"}, {"independence"},
                        {"labor"}, {"columbus"}, {"veterans"}, {"thanksgiving"}, {"christmas"}};
            default:
                return new String[][]{};
        }
    }

    public static final List<String> getAnswer(int question) {
        switch (question) {
            case 1:
                return new ArrayList<>(Arrays.asList("Set up the government", "Defines the government", "Protects the basic rights of Americans"));
            case 2:
                return new ArrayList<>(Arrays.asList("We the People"));
            case 3:
                return new ArrayList<>(Arrays.asList("A change to the Constitution", "An addition to the Constitution"));
            case 4:
                return new ArrayList<>(Arrays.asList("The Bill of Rights"));
            case 5:
                return new ArrayList<>(Arrays.asList("Speech", "Assembly", "Religion", "Press", "Petition the Government"));
            case 7:
                return new ArrayList<>(Arrays.asList("Announce our independence from GB", "Declared our independence from GB", "Said that the US is free from GB"));
            case 8:
                return new ArrayList<>(Arrays.asList("Life", "Liberty", "Pursuit of Happiness"));
            case 9:
                return new ArrayList<>(Arrays.asList("Freedom of Religion"));
            case 10:
                return new ArrayList<>(Arrays.asList("Capitalist Economy", "Market Economy"));
            case 11:
                return new ArrayList<>(Arrays.asList("Everyone must follow the law", "Leaders must obey the law", "Government must obey the law", "No one is above the law"));
            case 12:
                return new ArrayList<>(Arrays.asList("Congress", "Legislative", "President", "Executive", "The Courts", "Judicial"));
            case 13:
                return new ArrayList<>(Arrays.asList("Checks and Balances", "Separation of Powers"));
            case 14:
                return new ArrayList<>(Arrays.asList("The President"));
            case 15:
                return new ArrayList<>(Arrays.asList("Congress", "Senate and House of Representatives", "(US or national) Legislature"));
            case 16:
                return new ArrayList<>(Arrays.asList("Senate", "House of Representatives"));
            case 19:
                return new ArrayList<>(Arrays.asList("Cory Booker", "Bob Menendez"));
            case 22:
                return new ArrayList<>(Arrays.asList("Frank Pallone", "Leonard Lance", "Bonnie Watson Coleman"));
            case 24:
                return new ArrayList<>(Arrays.asList("Because of the state's population", "Because they have more people", "Because some states have more people"));
            case 26:
                return new ArrayList<>(Arrays.asList("November"));
            case 27:
                return new ArrayList<>(Arrays.asList("Donald J. Trump", "Donald Trump", "Trump"));
            case 28:
                return new ArrayList<>(Arrays.asList("Michael R. Pence", "Mike Pence", "Pence"));
            case 29:
                return new ArrayList<>(Arrays.asList("Vice President"));
            case 30:
                return new ArrayList<>(Arrays.asList("The Speaker of the House"));
            case 31:
                return new ArrayList<>(Arrays.asList("The President"));
            case 32:
                return new ArrayList<>(Arrays.asList("The President"));
            case 33:
                return new ArrayList<>(Arrays.asList("The President"));
            case 34:
                return new ArrayList<>(Arrays.asList("Advises the President"));
            case 35:
                return new ArrayList<>(Arrays.asList("Secretary of Agriculture", "Secretary of Commerce", "Secretary of Defense",
                                                     "Secretary of Education", "Secretary of Energy", "Secretary of Health and Human Services",
                                                     "Secretary of Homeland Security", "Secretary of Housing and Urban Development", "Secretary of the Interior",
                                                     "Secretary of Labor", "Secretary of State", "Secretary of Transportation", "Secretary of the Treasury",
                                                     "Secretary of Veterans Affairs", "Attorney General", "Vice President"));
            case 36:
                return new ArrayList<>(Arrays.asList("Reviews Laws", "Explains Laws", "Resolves disputes", "Decides if a law goes against the Constitution"));
            case 37:
                return new ArrayList<>(Arrays.asList("The Supreme Court"));
            case 39:
                return new ArrayList<>(Arrays.asList("John Roberts"));
            case 40:
                return new ArrayList<>(Arrays.asList("To print money", "To declare war", "To create an army", "To make treaties"));
            case 41:
                return new ArrayList<>(Arrays.asList("Provide schooling and education", "Provide protection", "Provide safety", "Give a driver's license", "Approving zoning and land use"));
            case 42:
                return new ArrayList<>(Arrays.asList("Chris Christie", "Phil Murphy"));
            case 43:
                return new ArrayList<>(Arrays.asList("Trenton"));
            case 44:
                return new ArrayList<>(Arrays.asList("Democrat", "Republican"));
            case 45:
                return new ArrayList<>(Arrays.asList("Republican"));
            case 46:
                return new ArrayList<>(Arrays.asList("Paul Ryan"));
            case 47:
                return new ArrayList<>(Arrays.asList("Citizens 18 and older can vote", "You don't have to pay a poll tax to vote", "Any citizen can vote", "A male citizen of any race can vote"));
            case 48:
                return new ArrayList<>(Arrays.asList("Serve on a jury", "Vote in a federal election"));
            case 49:
                return new ArrayList<>(Arrays.asList("Vote in a federal election", "Run for federal office"));
            case 50:
                return new ArrayList<>(Arrays.asList("Freedom of expression", "Freedom of speech", "Freedom of assembly",
                                                     "Freedom to petition the government", "Freedom of religion", "The right to bear arms"));
            case 51:
                return new ArrayList<>(Arrays.asList("The United State", "The flag"));
            case 52:
                return new ArrayList<>(Arrays.asList("Give up loyalty to other countries", "Defend the Constitution and laws of the US",
                                                     "Obey the laws of the US", "Serve in the US military (if needed)",
                                                     "Serve the nation", "Be loyal to the US"));
            case 54:
                return new ArrayList<>(Arrays.asList("Vote", "Join a political party", "Help with a campaign", "Join a civic group",
                                                     "Join a community group", "Give an elected official your opinion on an issue",
                                                     "Call Senators and Representative", "Publicly support or oppose and issue or policy",
                                                     "Run for office", "Write to a newspaper"));
            case 57:
                return new ArrayList<>(Arrays.asList("Freedom", "Political liberty", "Religious Freedom", "Economic opportunity",
                                                     "Practice their religion", "Escape persecution"));
            case 58:
                return new ArrayList<>(Arrays.asList("American Indians", "Native Americans"));
            case 59:
                return new ArrayList<>(Arrays.asList("Africans", "People from Africa"));
            case 60:
                return new ArrayList<>(Arrays.asList("Because of high taxes", "Because the British army stayed in their houses", "Because they didn't have self-government"));
            case 62:
                return new ArrayList<>(Arrays.asList("July 4th, 1776"));
            case 63:
                return new ArrayList<>(Arrays.asList("New Hampshire", "Massachusetts", "Rhode Island", "Connecticut", "New York", "New Jersey",
                                                     "Pennsylvania", "Deleware", "Maryland", "Virginia", "North Carolina", "South Carolina", "Georgia"));
            case 66:
                return new ArrayList<>(Arrays.asList("James Madison", "Alexander Hamilton", "John Jay", "Publius"));
            case 67:
                return new ArrayList<>(Arrays.asList("US diplomat", "Oldest member of the Constitutional Convention", "First Postmaster General of US",
                                                     "Writer of Poor Richard's Almanac", "Started first free libraries"));
            case 68:
                return new ArrayList<>(Arrays.asList("George Washington"));
            case 69:
                return new ArrayList<>(Arrays.asList("George Washington"));
            case 70:
                return new ArrayList<>(Arrays.asList("Lousiana"));
            case 71:
                return new ArrayList<>(Arrays.asList("War of 1812", "Mexican-American War", "Civil War", "Spanish-American War"));
            case 72:
                return new ArrayList<>(Arrays.asList("Civil War", "The War between the States"));
            case 73:
                return new ArrayList<>(Arrays.asList("Slavery", "Economic reasons", "State's Rights"));
            case 74:
                return new ArrayList<>(Arrays.asList("Freed the slaves", "Saved the Union", "Led US during Civil War"));
            case 75:
                return new ArrayList<>(Arrays.asList("Freed the slaves", "Freed slaves in Confederacy", "Freed slaves in the Confederate States", "Freed slaves in most Southern states"));
            case 76:
                return new ArrayList<>(Arrays.asList("Fought for women's rights", "Fought for civil rights"));
            case 77:
                return new ArrayList<>(Arrays.asList("World War 1", "World War 2", "Korean War", "Vietnam War", "(Persian) Gulf War"));
            case 78:
                return new ArrayList<>(Arrays.asList("Woodrow Wilson"));
            case 79:
                return new ArrayList<>(Arrays.asList("Franklin Delano Roosevelt"));
            case 80:
                return new ArrayList<>(Arrays.asList("Japan", "Germany", "Italy"));
            case 82:
                return new ArrayList<>(Arrays.asList("Communism"));
            case 83:
                return new ArrayList<>(Arrays.asList("Civil rights (movement)"));
            case 84:
                return new ArrayList<>(Arrays.asList("Fought for civil rights", "Worked for equality for all Americans"));
            case 85:
                return new ArrayList<>(Arrays.asList("Terrorists attacked the US"));
            case 86:
                return new ArrayList<>(Arrays.asList("Cherokee", "Navajo", "Sioux", "Chippewa", "Choctaw", "Pueblo", "Apache", "Iroquois", "Creek",
                                                     "Blackfeet", "Seminole", "Cheyenne", "Arawak", "Shawnee", "Mohegan", "Huron", "Oneida", "Lakota",
                                                     "Crow", "Teton", "Hopi", "Inuit"));
            case 87:
                return new ArrayList<>(Arrays.asList("Missouri River", "Mississippi River"));
            case 88:
                return new ArrayList<>(Arrays.asList("Pacific Ocean"));
            case 89:
                return new ArrayList<>(Arrays.asList("Atlantic Ocean"));
            case 90:
                return new ArrayList<>(Arrays.asList("Puerto Rico", "Virgin Islands", "American Samoa", "Northern Mariana Islands", "Guam"));
            case 91:
                return new ArrayList<>(Arrays.asList("New Hampshire", "Maine", "Vermont", "New York", "Pennysylvania", "Ohio", "Michigan", "Minnesota",
                                                     "North Dakota", "Montana", "Idaho", "Washington", "Alaska"));
            case 92:
                return new ArrayList<>(Arrays.asList("California", "Arizona", "New Mexico", "Texas"));
            case 93:
                return new ArrayList<>(Arrays.asList("Washington D.C."));
            case 94:
                return new ArrayList<>(Arrays.asList("New York Harbor", "Liberty Island" ,"New Jersey"));
            case 95:
                return new ArrayList<>(Arrays.asList("13 original colonies"));
            case 96:
                return new ArrayList<>(Arrays.asList("One star for each state", "Each star represents a state", "50 states"));
            case 97:
                return new ArrayList<>(Arrays.asList("Star-Spangled Banner"));
            case 99:
                return new ArrayList<>(Arrays.asList("New Year's Day", "Martin Luther King Jr. Day", "President's Day", "Memorial Day",
                                                     "Independence Day", "Labor Day", "Columbus Day", "Veterans Day", "Thanksgiving", "Christmas"));
            default:
                return new ArrayList<>();
        }
    }

    /**
     * If the question if a multiple-choice question, return potential answer choices depending on the question
     *
     * @param question question ID
     * @return answer choices
     */
    public static final String[] getAnswerChoices(int question) {
        switch (question) {
            case 0:
                return new String[]{"The Constitution", "Declaration of Independence", "Articles of Confederation", "Freedom Papers"};
            case 6:
                return new String[]{"25", "26", "27", "28"};
            case 17:
                return new String[]{"200", "435", "50", "100"};
            case 18:
                return new String[]{"5", "6", "7", "8"};
            case 20:
                return new String[]{"200", "435", "50", "100"};
            case 21:
                return new String[]{"2", "4", "6", "8"};
            case 23:
                return new String[]{"The Supreme Court", "The President", "The US", "All people of the state"};
            case 25:
                return new String[]{"8", "6", "4", "2"};
            case 38:
                return new String[]{"9", "11", "7", "5"};
            case 53:
                return new String[]{"17", "21", "20", "18"};
            case 55:
                return new String[]{"March 15", "March 31", "April 15", "April 30"};
            case 56:
                return new String[]{"18", "17", "21", "19"};
            case 61:
                return new String[]{"Benjamin Franklin", "John Adams", "Thomas Jefferson", "George Washington"};
            case 64:
                return new String[]{"The Declaration of Independence was written.", "The Constitution was written.", "The US waged war on Great Britain.", "The first 13 colonies were created."};
            case 65:
                return new String[]{"1776", "1787", "1800", "1780"};
            case 81:
                return new String[]{"World War I", "World War II", "Revolutionary War", "Civil War"};
            case 98:
                return new String[]{"January 15th", "January 1st", "December 31st", "July 4th"};
            default:
                return new String[]{"Error", "Error", "Error", "Error"};
        }
    }

    /**
     * If the question is a multiple-choice question return the position of the correct answer
     *
     * @param question question ID
     * @return the position of the correct answer for a question
     */
    public static final int getCorrectAnswer(int question) {
        switch (question) {
            case 0:
                return 0;
            case 6:
                return 2;
            case 17:
                return 3;
            case 18:
                return 1;
            case 20:
                return 1;
            case 21:
                return 0;
            case 23:
                return 3;
            case 25:
                return 2;
            case 38:
                return 0;
            case 53:
                return 3;
            case 55:
                return 2;
            case 56:
                return 0;
            case 61:
                return 2;
            case 64:
                return 1;
            case 65:
                return 1;
            case 81:
                return 1;
            case 98:
                return 3;
            default:
                return -1;
        }
    }

    /**
     * String array of all the questions
     */
    public static final String[] questions = new String[]{
            QUESTION_1,
            QUESTION_2,
            QUESTION_3,
            QUESTION_4,
            QUESTION_5,
            QUESTION_6,
            QUESTION_7,
            QUESTION_8,
            QUESTION_9,
            QUESTION_10,
            QUESTION_11,
            QUESTION_12,
            QUESTION_13,
            QUESTION_14,
            QUESTION_15,
            QUESTION_16,
            QUESTION_17,
            QUESTION_18,
            QUESTION_19,
            QUESTION_20,
            QUESTION_21,
            QUESTION_22,
            QUESTION_23,
            QUESTION_24,
            QUESTION_25,
            QUESTION_26,
            QUESTION_27,
            QUESTION_28,
            QUESTION_29,
            QUESTION_30,
            QUESTION_31,
            QUESTION_32,
            QUESTION_33,
            QUESTION_34,
            QUESTION_35,
            QUESTION_36,
            QUESTION_37,
            QUESTION_38,
            QUESTION_39,
            QUESTION_40,
            QUESTION_41,
            QUESTION_42,
            QUESTION_43,
            QUESTION_44,
            QUESTION_45,
            QUESTION_46,
            QUESTION_47,
            QUESTION_48,
            QUESTION_49,
            QUESTION_50,
            QUESTION_51,
            QUESTION_52,
            QUESTION_53,
            QUESTION_54,
            QUESTION_55,
            QUESTION_56,
            QUESTION_57,
            QUESTION_58,
            QUESTION_59,
            QUESTION_60,
            QUESTION_61,
            QUESTION_62,
            QUESTION_63,
            QUESTION_64,
            QUESTION_65,
            QUESTION_66,
            QUESTION_67,
            QUESTION_68,
            QUESTION_69,
            QUESTION_70,
            QUESTION_71,
            QUESTION_72,
            QUESTION_73,
            QUESTION_74,
            QUESTION_75,
            QUESTION_76,
            QUESTION_77,
            QUESTION_78,
            QUESTION_79,
            QUESTION_80,
            QUESTION_81,
            QUESTION_82,
            QUESTION_83,
            QUESTION_84,
            QUESTION_85,
            QUESTION_86,
            QUESTION_87,
            QUESTION_88,
            QUESTION_89,
            QUESTION_90,
            QUESTION_91,
            QUESTION_92,
            QUESTION_93,
            QUESTION_94,
            QUESTION_95,
            QUESTION_96,
            QUESTION_97,
            QUESTION_98,
            QUESTION_99,
            QUESTION_100,
    };
}
