// --== CS400 File Header Information ==--
// Name: Arnav Mehta
// Email: anmehta4@wisc.edu email address
// Team: LC
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

/**
 * This interface simply creates the 50 values for each of the 50 states and is implemented by the
 * TouristGuide application. Each object is created with the 4 strings as arguments - most popular
 * destination for that state, its address, the second most popular destination for that state, and
 * its address
 * 
 * @author ishitadhoot
 *
 */
public interface GuideObjects {

  public static Destinations AlabamaD =
      new Destinations("US Space and Rocket Center", "1 Tranquility Base, Huntsville, AL 35805",
          "Gulf Shores Beach", "101 Gulf Shores Pkwy, Gulf Shores, AL 36542");

  public static Destinations AlaskaD =
      new Destinations("Denali National Park", "Parks Hwy, Denali National Park and Preserve, AK",
          "Chena Hot Springs", "17600 Chena Hot Springs Road, Fairbanks, AK 99712");

  public static Destinations ArizonaD = new Destinations("Antelope Canyon",
      "American Southwest, on Navajo land east of Page, Arizona 86040",
      "Grand Canyon National Park", "450 AZ-64, Grand Canyon Village, AZ 86023");

  public static Destinations ArkansasD =
      new Destinations("Bathhouse Row", "101 Reserve Street\n" + "Hot Springs , AR 71901",
          "Crater of Diamonds State Park", "209 State Park Rd, Murfreesboro, AR 71958");

  public static Destinations CaliforniaD = new Destinations("DisneyLand",
      "Disneyland Dr, Anaheim, CA 92802", "Yosemite National Park",
      "It is in east-central California, U.S. It is situated about 140 miles (225 km) east of the city of San Francisco and some 100 miles (160 km) southeast of Sacramento.");

  public static Destinations ColoradoD = new Destinations("Mesa Verde National Park",
      "Mesa Verde, CO", "Great Sand Dunes National Park",
      "The main park area can be easily accessed by car from local highways. To get to the park, take Highway 150 from the south, or you can take County Road 6 from the west. Both of these will take you to the Visitor Center, Pinon Flats Campground and the Dunes Parking Lot.");

  public static Destinations ConnecticutD = new Destinations("Yale University",
      "New Haven, CT 06520", "Mystic Aquarium", "55 Coogan Blvd, Mystic, CT 06355");

  public static Destinations DelawareD = new Destinations("Lewes Beach", "Lewes, DE 19958",
      "Rehoboth Boardwalk", "Rehoboth Beach, DE 19971\n" + "");

  public static Destinations FloridaD = new Destinations("Everglades National Park",
      "Everglades National Park, large natural area encompassing the southwestern portion of the more extensive Everglades region in southern Florida",
      "Universal Studios", "6000 Universal Blvd, Orlando, FL 32819");

  public static Destinations GeorgiaD =
      new Destinations("Georgia Aquarium", "225 Baker St NW, Atlanta, GA 30313",
          "Six Flags Over Georgia", "275 Riverside Pkwy, Austell, GA 30168");

  public static Destinations HawaiiD =
      new Destinations("Kailua Beach", "526 Kawailoa Rd, Kailua, HI 96734",
          "Hawaii Volcanoes National Park", "Hawaii Volcanoes National Park, HI 96718");

  public static Destinations IdahoD = new Destinations("Big Springs",
      "RANGER DISTRICT: Ashton-Island Park\n" + "NEAREST CITY/TOWN: Island Park",
      "Sawtooth National Recreation Area", "5 Northfork Canyon Rd, Ketchum, ID 83340");

  public static Destinations IllinoisD =
      new Destinations("Wrigley Field", "1060 W Addison St, Chicago, IL 60613", "Millennium Park",
          "201 E Randolph St, Chicago, IL 60602");

  public static Destinations IndianaD = new Destinations("University of Notre Dame",
      "Notre Dame, IN 46556", "Indiana Dunes State Park", "1600 N 25 E, Chesterton, IN 46304");

  public static Destinations IowaD =
      new Destinations("Adventureland", "3200 Adventureland Dr, Altoona, IA 50009",
          "Iowa State Fairgrounds", "3000 E Grand Ave, Des Moines, IA 50317");

  public static Destinations KansasD = new Destinations("Monument Rocks",
      "Gove 16, Oakley, KS 67748", "Exploration Place", "300 N McLean Blvd, Wichita, KS 67203");

  public static Destinations KentuckyD = new Destinations("Churchil Downs",
      "700 Central Ave, Louisville, KY 40208", "Cumberland Falls", "7351 Hwy 90, Corbin, KY 40701");

  public static Destinations LouisianaD =
      new Destinations("Canal Street", "921 Canal St, New Orleans, LA 70112", "Mardi Gras World",
          "1380 Port of New Orleans Pl, New Orleans, LA 70130");

  public static Destinations MaineD = new Destinations("Attean Pond",
      "105 Attean Rd, Jackman, ME 04945", "Acadia National Park",
      "By car: From Boston take I-95 north to Augusta, Maine, then Route 3 east to Ellsworth, and on to Mount"
          + " Desert Island. For an alternate route, continue on I-95 north to Bangor, Maine, then take Route 1A "
          + "east to Ellsworth. In Ellsworth, take Route 3 to Mount Desert Island.\n By Flight: Direct flights from "
          + "Boston's Logan Airport land at the Hancock County Airport, 10 miles from Acadia National Park. National "
          + "airlines serve the Bangor International Airport, about one hour from the park. Car rentals are available "
          + "at both airports.");

  public static Destinations MarylandD =
      new Destinations("Inner Harbor", "201 E Pratt St, Baltimore, MD 21202",
          "Assateague Island National Seashore", "7206 National Seashore Ln, Berlin, MD 21811");

  public static Destinations MassachusettsD = new Destinations("Boston Common",
      "139 Tremont St, Boston, MA 02111", "Fenway Park", "4 Jersey St, Boston, MA 02215");

  public static Destinations MichiganD = new Destinations("Pictured Rocks National Lakeshore",
      "N8391 Sand Point Rd, Munising, MI 49862", "Tahquamenon Falls",
      "41382 W M-123, Paradise, MI 49768");

  public static Destinations MinnesotaD = new Destinations("Voyageurs National Park",
      "360 Minnesota 11 East, International Falls, MN 56649", "Minnesota State Fair Grounds",
      "1265 Snelling Ave N, St Paul, MN 55108");

  public static Destinations MississippiD = new Destinations("Oxford",
      "Oxford is a city in, and the county seat of, Lafayette County, Mississippi", "Biloxi Beach",
      "1027-1031 Beach Blvd, Biloxi, MS 39530");

  public static Destinations MissouriD = new Destinations("St Louis Zoo",
      "201 S 18th St, St. Louis, MO 63103", "The Gateway Arch", "St. Louis, MO 63102");

  public static Destinations MontanaD = new Destinations("Yellowstone National Park",
      "The North Entrance of Yellowstone National Park located at Gardiner, Montana is the Only Entrance "
          + "that is Open Year Round. From the North Entrance you can travel north on US 89 to Livingston, "
          + "Montana or south into Yellowstone.",
      "Glacier National Park",
      "The most convenient airport to Whitefish and Glacier National Park is the "
          + "Glacier Park International Airport (FCA) located in Kalispell, MT. The airport is 30 miles "
          + "from the West Entrance of Glacier National Park and 12 miles from the town of Whitefish.");

  public static Destinations NebraskaD = new Destinations("Henry Doorly Zoo and Aquarium",
      "3701 S 10th St, Omaha, NE 68107, United States", " Lincoln Children's Museum",
      "1420 P Street, Lincoln, 68508, NE");

  public static Destinations NevadaD =
      new Destinations("Hoover Dam", "795 E Tropicana Ave, Las Vegas, NV 89119, United States",
          "Stratosphere", "2000 Las Vegas Boulevard South, Las Vegas, 89104, NV");

  public static Destinations New_HampshireD = new Destinations("Kancamagus Highway",
      "Route 112, North Conway, Conway, NHMap", "Story Land", "850 NH Route 16, Glen, 03838, NH");

  public static Destinations New_JerseyD = new Destinations("Atlantic City Boardwalk",
      "3109 Boardwalk, Atlantic City, NJ 08401, United States", "Morey’s Piers",
      "3501 Boardwalk,, Wildwood, 08260 , NJ");

  public static Destinations New_MexicoD =
      new Destinations("White Sands National Park", "U.S. Route 70 Alamogordo, NM 88310",
          "Carlsbad Caverns National Park", "Carlsbad, NM 88220, United States");

  public static Destinations New_YorkD =
      new Destinations("Statue of Liberty", "New York, NY 10004, United States",
          "Rockefeller Center", "45 Rockefeller Plaza, New York, NY 10111, United States");

  public static Destinations North_CarolinaD = new Destinations("Wright Brothers National Memorial",
      "1401 National Park Drive, Off U.S. 158 between mile marker 7 and 8, Kill Devil Hills, Outer Banks, NC",
      "Pisgah National Forest", "1600 Pisgah Hwy, Pisgah Forest, NC 28768");

  public static Destinations North_DakotaD =
      new Destinations("Fargo Air Museum", "1609 19th Ave. N, Fargo, ND", "National Buffalo Museum",
          "500 17th Street SE, Jamestown, North Dakota");

  public static Destinations OhioD = new Destinations("rock and roll hall of fame",
      "1100 E 9th St,   Cleveland, OH 44114", "National Museum of the US Air Force",
      "1100 Spaatz Street, Wright-Patterson AFB, Dayton, Ohio");

  public static Destinations OklahomaD =
      new Destinations("The Cave House", "1623 Charles Page Blvd, Tulsa, OK 74127",
          "Woody Guthrie Center", "102 E. Brady St., Tulsa, OK");

  public static Destinations OregonD = new Destinations("Columbia River Gorge National Scenic Area",
      "Forest Service Office, 902 Wasco St Suite 200, Hood River, OR 97031", "Haystack Rock",
      "Highway 101, Cannon Beach, OR");

  public static Destinations PennsylvaniaD =
      new Destinations("Hersheypark", "100 Hersheypark Dr,Hershey, PA 17033", "Duquesne Incline",
          "1197 W. Carson St., Pittsburgh, 15219, PA");

  public static Destinations Rhode_IslandD =
      new Destinations("Stroll the Cliff Walk", "117 Memorial Blvd., Newport, 02840, RI",
          "Roger Williams Park Zoo", "1000 Elmwood Avenue, Providence, Rhode Island");

  public static Destinations South_CarolinaD = new Destinations("Huntington Beach State Park",
      "16148 Ocean Hwy, Murrells Inlet, South Carolina", "South Carolina State Museum",
      "301 Gervais Street, Columbia");

  public static Destinations TennesseeD = new Destinations("Country Music Hall of Fame and Museum",
      "222 Fifth Avenue South, Nashville, 37203, TN", "Graceland",
      "Elvis Presley Blvd, Memphis, TN 38116, United States");

  public static Destinations TexasD = new Destinations("San Antonio River Walk ",
      " 849 E Commerce St, San Antonio, TX 78205, United States", "Sea Turtle Inc.",
      "6617 Padre Boulevard, South Padre Island, 78597, TX");

  public static Destinations UtahD = new Destinations("Dinosaur National Monument",
      " 11625 E 1500 S, Jensen, UT 84035, United States", "Temple Square",
      "50 N Temple, Salt Lake City, UT 84150, United States");

  public static Destinations VermontD = new Destinations("Vermont Teddy Bear Company",
      "6555Shelburne Road, Shelburne, 05482, VT", "Ben & Jerry’s Factory",
      "1281 Waterbury-Stowe Road, VT-100, Waterbury Village Historic District, VT 05676");

  public static Destinations VirginiaD = new Destinations(" Arlington National Cemetery",
      "3200 Mount Vernon Memorial Highway, Mount Vernon, Virginia",
      "Monticello and Charlottesville", "Thomas Jefferson Parkway, Charlottesville, Virginia");

  public static Destinations WashingtonD =
      new Destinations("Pike Place Market", "93 Pike St Room 310, Seattle, WA 98101, United States",
          "Space Needle", "Seattle Center at 400 Broad Street, Seattle, 98109, WA");

  public static Destinations West_VirginiaD =
      new Destinations("Harpers Ferry", "171 Shoreline Dr, Harpers Ferry, WV 25425, United States",
          "Lost World Caverns", " 907 Lost World Rd, Lewisburg, WV 24901, United States");

  public static Destinations WisconsinD = new Destinations("Peninsula State Park",
      "9462 Shore Rd, Fish Creek, Fish Creek, 54212-0218, WI", "EAA AirVenture",
      "EAA Aviation Center, 3000 Poberezny Road, Oshkosh, Wisconsin");

  public static Destinations WyomingD =
      new Destinations("Old Faithful", "Center Loop Road, Yellowstone National Park, WY",
          "National Elk Refuge", "675 E Broadway Ave, Jackson, WY 83001, United States");
}
