package OOP_Project.model;

import java.util.ArrayList;

public class Milk
{	
	public static ArrayList<Milk> milks = new ArrayList<Milk>(){}; 
    String name, image, scientificName, description;
    String milkName, milkDescription;
    String[] benefits;
    String[] brand1;
	String[] brand2;
	String[] brand3;
    String[] nutrients;
	String[] bestFor;
    String milkBrand1, milkBrand2, milkBrand3;

	public Milk(String name, String image, String scientificName, String description,
	String milkName, String milkDescription,
	String[] benefits, String[] nutrients, String[] bestFor,
	String[] brand1, String[] brand2, String[] brand3)
	{
		this.name = name;
		this.image = image;
		this.scientificName = scientificName;
		this.description = description;
		this.milkName = milkName;
		this.milkDescription = milkDescription;
		this.benefits = benefits;
		this.nutrients = nutrients;
		this.bestFor = bestFor;
		this.brand1 = brand1;
		this.brand2 = brand2;
		this.brand3 = brand3;
	}
    
	public String getMName(){
		return milkName;
	}
	public String[] getBest(){
		return bestFor;
	}
	public String getSName(){
		return scientificName;
	}
	public String getName(){
		return name;
	}
	public String getImage(){
		return image;
	}
	public String getDescription(){
		return description;
	}
	public String[] getBenefits(){
		return benefits;
	}
	public String getMilkDescription(){
		return milkDescription;
	}
	public String[] getNutrients(){
		return nutrients;
	}
	public String[] getBrand1(){
		return brand1;
	}
	public String[] getBrand2(){
		return brand2;
	}
	public String[] getBrand3(){
		return brand3;
	}
	public static void makeData(){
		String[] riceMilkBenefits = {
			"No Saturated Fat or Cholesterol",
			"Good Source of B Vitamins",
			"Promote Cardiovascular Health"
		};	
		String[] riceMilkNutrients = {
			"Calories: 115",
			"Fat: 2.4g",
			"Carbohydrates: 22.4g",
			"Fiber: 0.7g",
			"Protein: 0.7g"
		};
		String[] riceMilkBestFor = {
			"Dairy-Free Alternative",
			"Vegan and Vegetarian Diets",
			"Hypoallergenic"
		};
		Milk riceMilk = new Milk("Rice", "images/rice.png", "(Oryza sativa)", "Rice: global staple, diverse uses in Asian cuisine from grains to noodles and drinks.", 
		"Rice Milk", "Rice milk, a fortified plant-based option, crafted from rice and enriched with essential nutrients like B12, calcium, iron, and vitamin D.", 
			riceMilkBenefits, riceMilkNutrients, riceMilkBestFor,
		new String[]{"PURE HARVEST ORGANIC RICE MILK", "images/Pure.png", 
				"https://shp.lol/nbh6", 
				"https://shp.lol/MQ4y", 
				"https://shp.lol/sn2o"
      	},new String[]{"DREAM RICE MILK", "images/Dream.png", 
				"https://shp.lol/CoNe", 
				"https://shp.lol/2iXg", 
				"N/A"}, new String[]{"N/A","images/NA.png","N/A","N/A","N/A"});

      	Milk almondMilk = new Milk(
			"Almonds",
			"images/ALMONDS.png",
			"(Prunus Dulcis)",
			"Almonds from the USA, Spain, Australia vary, eating regularly helps against health issues.",
			"Almond Milk",
			"Almond milk is a plant-based alternative to traditional dairy milk, made by blending almonds with water and then straining out the solids.",
			new String[]{ //benefits
				"May boost your antioxidants",
				"May aid your vision health",
				"May reduce the risk of heart disease",
			},
			new String[]{ //nutrition facts per 1 cup
				"Calories: 73g",
				"Protein: 1g",
				"Carbohydrates: 10.5g",
				"Fat: 3g",
				"Fiber: 1g"
			},
			new String[]{ //Best For
				"People with weight management goals",
				"People with Lactose Intolerance",
				"People who are diabetic"
			},
			new String[]{ //brand1
				"Silk Almond Unsweetened Milk",
				"images/uAlmond.png",
				"https://shp.zone/AuR1",
				"https://shp.lol/ktER",
				"https://shp.lol/GzFJ",
			},
			new String[]{ //brand2
				"Natrue Unsweetened Almond Milk Drink",
				"images/natureAlmond.png",
				"https://shp.lol/VCiY",
				"https://shp.lol/d5rm",
				"https://shp.lol/e35w",
			},
			new String[]{
				"Almond Breeze Almond Milk Latter",
				"images/almondBreeze.png",
				"https://shp.lol/94hj",
				"https://shp.lol/o2RL",
				"https://shp.lol/kuau"

			}
		);
      
      	String[] soyMilkBenefits = {
			"No Saturated Fat or Cholesterol",
			"Good Source of B Vitamins",
			"May reduce the risk of chronic diseases"
		};
		
		String[] soyMilkNutrients = {
			"Calories: 100",
			"Fat: 4.9 grams",
			"Carbohydrates: 7 grams",
			"Protein: 7 grams",
			"Calcium: 380 milligrams(mg)"
		};
		
		String[] soyMilkBestFor = {
			"Dairy-Free Alternative",
			"Vegan and Vegetarian Diets",
			"Heart and Bone Health"
		};
		
		Milk soyMilk = new Milk(
			"Soy",
			"images/SOY.png",
			"(Glycine max)",
			"Soy: Plant-based protein, versatile, and nutritious.",
			"Soy Milk",
			"Soy milk, a versatile plant-based option rich in nutrients like protein, calcium, and vitamins, linked to various health advantages.",
			soyMilkBenefits,
			soyMilkNutrients,
			soyMilkBestFor,
			new String[]{
				"Silk Soymilk",
				"images/silkSoy.png",
				"https://shp.lol/hrn0",
				"https://shp.lol/p789",
				"https://shp.lol/hTNE"
			},
			new String[]{
				"Vitasoy",
				"images/vitasoy.png",
				"https://shp.lol/y2Ha",
				"https://shp.lol/lfFz",
				"https://shp.lol/OkeT"
			},
			new String[]{
				"Dutchmill Soymilk",
				"images/dutchSoy.png",
				"https://shp.lol/6gbB",
				"https://shp.lol/AThO",
				"https://shp.lol/GwbF"
			}
		);

    	Milk oatMilk = new Milk(
			"Oat",
			"images/OATS.png",
			"Avena sativa",
			"is a type of cereal grain from the Poaceae grass family of plants.",
			"Oats Milk",
			"Oat Milk is a plant milk derived from whole oat (Avena spp.) grains[1] by extracting the plant material with water.",
			new String[]{"Dairy Free", "High in Fibre", "High in Vitamins"},
			new String[]{"Calories: 120", "Protein: 3grams", "Fat: 5grams", "Vitamin B12: 50% of the Daily Value (DV)"},
			new String[]{"Lactose-Intolerant Individuals", "Vegans and Vegetarians", "People with Nut Allergies"},
			new String[]{"Oat Side", "images/oatside.png", "https://shp.lol/rTwS", "https://shp.lol/0FTz", "https://shp.lol/yZbQ"},
			new String[]{"Pure Harvest Organic Oatmilk", "images/pureoat.png", "https://shp.lol/R314", "https://shp.lol/ZPjA", "https://shp.lol/03hF"},
			new String[]{"Pacific Foods Organic Oat Plant-based", "images/pacific.png", "https://shp.lol/J6GS", "https://shp.lol/7eQJ", "https://shp.lol/lt2M"}
		);

    	Milk coconutMilk = new Milk (
			"Coconut",
			"images/coconut.png",
			"Cocos Nucifera",
			"The coconut palm, part of the Arecaceae family, provides fruit, oil, water, and materials like husks and fronds.",
			"Coconut Milk",
			"Coconut Milk is an opaque, milky white liquid extracted from the grated pulp of mature coconuts.",
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Coco Mama Fresh Gata",
				"images/cMAMA.png",
				"https://shp.lol/pPIJ",
				"https://shp.lol/wo9E",
				"https://shp.lol/oq7k"
			},
			new String[]{ //brand2
				"Field Day",
				"images/field.png",
				"https://shp.lol/0kgf",
				"https://shp.zone/1EfH",
				"https://shp.zone/Zv8H"
			},
			new String[]{//brand3
				"Nature's Charm",
				"images/nCharm.png",
				"https://shp.lol/wZA9",
				"https://shp.zone/rjzu",
				"https://shp.zone/mYVY"
			}
		);
		
		Milk wholeMilk = new Milk(
		"Dairy Cow", 
		"images/Dairy.png", 
		"(Bos Taurus)", 
		"Dairy cattle, commonly referred to as dairy cows, are a specific type of cattle primarily bred and raised for milk production.", 
		"Whole Cow Milk", 
		"Contains about 87% water,This milk hasn’t had its fat content stripped. The milk retains its fat and is slightly thick.Also known as full cream",
			new String[]{ //benefits
				"Good for healthy bone development",
				"Helps with inflammatory issues",
				"Maintains heart health"
			},
			new String[]{ //nutrition facts
				"Calories: 149g",
				"Protein: 8g",
				"Carbohydrates: 12g",
				"Fat: 8g",
				"Calcium: 27% of DV"
			},
			new String[]{ //Best for
				"Kids ages 1 & 2 years old",
				"Sports Recovery",
				"People who want to gain weight"
			},
			new String[]{ //brand1
				"Hacienda Macalauan Fresh Whole Milk",
				"images/hacienda.png",
				"https://goo.su/k65V",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Nestle Fresh Milk",
				"images/nM.png",
				"https://goo.su/LrkT18",
				"https://goo.su/GWzKE8H",
				"https://goo.su/0h5VfU"
			},
			new String[]{//brand3
				"Selecta Farm Fresh milk",
				"images/sM.png",
				"https://goo.su/yZgd0",
				"https://goo.su/Xggp8",
				"https://goo.su/re3uK"
			});
		
		Milk camelMilk = new Milk(
		"Camel", 
		"images/Camel.png", 
		"(Camelus)", 
		"Dairy cattle, commonly referred to as dairy cows, are a specific type of cattle primarily bred and raised for milk production.", 
		"Camel Milk", 
		"Camel milk is a white liquid produced by the mammary glands of female camels. It has been a staple food in desert cultures for centuries, prized for its unique taste",
			new String[]{ //benefits
				"Lactose-friendly",
				"Rich in nutrients",
				"Antioxidant properties"
			},
			new String[]{ //nutrition facts
				"Calories: 80g",
				"Protein: 8g",
				"Carbohydrates: 11g",
				"Fat: 3.5g",
				"Calcium: 29% of DV"
			},
			new String[]{ //Best for
				"Individuals with lactose intolerance or dairy sensitivities",
				"People seeking a nutrient-rich alternative to cow's milk",
				"Those interested in exploring potential health benefits"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/pC.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			}
		);

		Milk lowFat = new Milk(
		"Dairy Cow", 
		"images/Dairy.png", 
		"(Bos Taurus)", 
		"Dairy cattle, commonly referred to as dairy cows, are a specific type of cattle primarily bred and raised for milk production.", 
		"Low-fat Milk", 
		"Contains slightly more calcium than full cream.1.5% less fat, and creamy flavor like full cream milk, with a texture that is slightly thinner and less rich in taste.",
			new String[]{ //benefits
				"Good for healthy bone development",
				"Helps with inflammatory issues",
				"Maintains heart health"
			},
			new String[]{ //nutrition facts
				"Calories: 100g",
				"Protein: 16g",
				"Carbohydrates: 24g",
				"Fat: 4.7g",
				"Calcium: 29% of DV"
			},
			new String[]{ //Best for
				"Pregnant Women.",
				"Seniors.",
				"Teenagers."
			},
			new String[]{ //brand1
				"Alaska Low Fat Milk",
				"images/alaska.png",
				"https://goo.su/MH3tP",
				"https://goo.su/PmYN",
				"https://goo.su/vMsi"
			},
			new String[]{ //brand2
				"Arla Organic Low Fat Milk",
				"images/arla.png",
				"https://goo.su/cx9eHG2",
				"https://goo.su/yetNp",
				"https://goo.su/myxDOg"
			},
			new String[]{//brand3
				"Nestle Low Fat Milk",
				"images/nes.png",
				"https://goo.su/euzJC",
				"https://goo.su/zy4O8Qy",
				"https://goo.su/UAxrS"
			});
		
		Milk skimMilk = new Milk(
		"Dairy Cow", 
		"images/Dairy.png", 
		"(Bos Taurus)", 
		"Dairy cattle, commonly referred to as dairy cows, are a specific type of cattle primarily bred and raised for milk production.", 
		"Skimmed Cow Milk", 
		"It has less than 0.15% fat. Some milks might have extra milk solids ( like lactose and protein) to optimize taste and texture, also known as fat-free or non-fat milk.",
			new String[]{ //benefits
				"Good for healthy bone development",
				"Helps with inflammatory issues",
				"Maintains heart health"
			},
			new String[]{ //nutrition facts
				"Calories: 167g",
				"Protein: 17g",
				"Carbohydrates: 24g",
				"Fat: 0.3g",
				"Calcium: 29% of DV"
			},
			new String[]{ //Best for
				"People with diabetes.",
				"Substitute for post-workout shake.",
				"Losing weight."
			},
			new String[]{ //brand1
				"Magnolia Non-Fat Fresh Milk",
				"images/mag.png",
				"https://goo.su/lBoeM9",
				"https://goo.su/8a6GH6",
				"https://goo.su/yNUEHg"
			},
			new String[]{ //brand2
				"Australias Own Skim Milk",
				"images/aus.png",
				"https://goo.su/tJpImYg",
				"https://goo.su/rdYSUwW",
				"https://goo.su/OjwaUl"
			},
			new String[]{//brand3
				"Arla Milk Goodness Skimmed",
				"images/arl.png",
				"https://goo.su/uOvD4",
				"https://goo.su/DqUcf",
				"https://goo.su/l0agio"
			});

		Milk lactoseMilk = new Milk(
		"Dairy Cow", 
		"images/Dairy.png", 
		"(Bos Taurus)", 
		"Dairy cattle, commonly referred to as dairy cows, are a specific type of cattle primarily bred and raised for milk production.", 
		"Lactose-free Cow Milk", 
		"Is real cow’s milk just like the other types of milk - but with one difference. The natural sugar in milk, called lactose, has been broken down. a great option for those who are lactose intolerant",
			new String[]{ //benefits
				"Good for healthy bone development",
				"Helps with inflammatory issues",
				"Maintains heart health"
			},
			new String[]{ //nutrition facts
				"Calories: 145g",
				"Protein: 32.8g",
				"Carbohydrates: 24g",
				"Fat: 3.2g",
				"Calcium: 123mg"
			},
			new String[]{ //Best for
				"Lactose Intolerant People.",
				"Heart Health",
				"Losing weight."
			},
			new String[]{ //brand1
				"Arla Goodness Lactose-Free Fresh Milk",
				"images/aLac.png",
				"https://goo.su/lBoeM9",
				"https://goo.su/jVpuvJH",
				"https://goo.su/gyWFT7"
			},
			new String[]{ //brand2
				"Cowhead Lactose Free Pure Milk",
				"images/cLac.png",
				"https://goo.su/ToR7a",
				"https://goo.su/4ozu08l",
				"https://goo.su/b8myw"
			},
			new String[]{//brand3
				"N/A",
				"images/NA.png",
				"N/A",
				"N/A",
				"N/A"
			});
		Milk organicMilk = new Milk(
		"Dairy Cow", 
		"images/Dairy.png", 
		"(Bos Taurus)", 
		"Dairy cattle, commonly referred to as dairy cows, are a specific type of cattle primarily bred and raised for milk production.", 
		"Organic Cow Milk", 
		"Organic milk is milk produced from cows that are raised following organic farming practices. Organic farming emphasizes sustainable and environmentally friendly agricultural methods",
			new String[]{ //benefits
				"Good for healthy bone development",
				"Helps with inflammatory issues",
				"Maintains heart health"
			},
			new String[]{ //nutrition facts
				"Calories: 150g",
				"Protein: 8g",
				"Carbohydrates: 12g",
				"Fat: 8g",
				"Calcium: 300mg"
			},
			new String[]{ //Best for
				"Health-Conscious Individuals.",
				"Individuals with Environmental Concerns.",
				"People with Certain Dietary Preferences."
			},
			new String[]{ //brand1
				"Organic Dairy Milk",
				"images/lP.png",
				"https://goo.su/gAZmdFZ",
				"https://goo.su/huGzh",
				"N/A"
			},
			new String[]{ //brand2
				"Arla Organic full cream milk",
				"images/aO.png",
				"https://goo.su/MHSx9",
				"https://goo.su/Di1Rd7",
				"N/A"
			},
			new String[]{//brand3
				"Horizon organic milk",
				"images/H.png",
				"https://goo.su/0BPPOI",
				"N/A",
				"N/A"
			});

		Milk reducedMilk = new Milk(
		"Dairy Cow", 
		"images/Dairy.png", 
		"(Bos Taurus)", 
		"Dairy cattle, commonly referred to as dairy cows, are a specific type of cattle primarily bred and raised for milk production.", 
		"Reduced Fat Cow Milk", 
		"Reduced-fat milk, often labelled as 2% milk, is a dairy product that has had a portion of its fat content removed. The percentage (2%) refers to the proportion of milk fat by weight in the total content of the milk.",
			new String[]{ //benefits
				"Good for healthy bone development",
				"Helps with inflammatory issues",
				"Maintains heart health"
			},
			new String[]{ //nutrition facts
				"Calories: 122g",
				"Protein: 8g",
				"Carbohydrates: 12g",
				"Fat: 5g",
				"Saturated Fat: 3g"
			},
			new String[]{ //Best for
				"Individuals Watching Fat Intake.",
				"Cardiovascular Health Considerations.",
				"Versatile Culinary Use."
			},
			new String[]{ //brand1
				"SELECTA Fortified Low Fat Milk",
				"images/sL.png",
				"https://goo.su/0YzWqU",
				"https://goo.su/aRBBLt",
				"https://goo.su/zfuTmbp"
			},
			new String[]{ //brand2
				"Lactaid 2% Reduced Fat Milk",
				"images/LL.png",
				"https://goo.su/kDbA",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Horizon Organic, Milk Lactose Free Reduce Fat Organic",
				"images/Hf.png",
				"https://goo.su/UNTAsft",
				"N/A",
				"N/A"
			});
		Milk flavoredMilk = new Milk(
		"Dairy Cow", 
		"images/Dairy.png", 
		"(Bos Taurus)", 
		"Dairy cattle, commonly referred to as dairy cows, are a specific type of cattle primarily bred and raised for milk production.", 
		"Flavored Cow Milk", 
		"Flavored milk is milk infused with added flavors, usually through the incorporation of sweeteners and flavorings. The most common flavors for milk include chocolate, strawberry, and vanilla.",
			new String[]{ //benefits
				"Good for healthy bone development",
				"Helps with inflammatory issues",
				"Maintains heart health"
			},
			new String[]{ //nutrition facts
				"Calories: 190g",
				"Protein: 8g",
				"Carbohydrates: 30g",
				"Fat: 5g",
				"Sugar: 26g"
			},
			new String[]{ //Best for
				"Taste Preference.",
				"Dietary Variety.",
				"Post-Workout Recovery."
			},
			new String[]{ //brand1
				"Bear Brand Fortified Chocolate Flavored Milk",
				"images/bC.png",
				"https://goo.su/1QQz3wn",
				"https://goo.su/MjYXO",
				"https://goo.su/Onbn"
			},
			new String[]{ //brand2
				"Bear Brand Adult Plus Milk Powder With Coffee",
				"images/C.png",
				"https://goo.su/PoDa10f",
				"https://goo.su/RnNu",
				"https://goo.su/uW65QU"
			},
			new String[]{//brand3
				"Mr Milk Yoghurt Flavoured Milk Drink",
				"images/Y.png",
				"https://goo.su/UVdsGGQ",
				"https://goo.su/q4ic",
				"https://fishersupermarket.ph/product/del-monte-mr-milk-original-yoghurt-milk-100ml-6s/"
			});
		Milk buffaloMilk = new Milk(
		"WATER BUFFALO", 
		"images/buffalo.jpg", 
		"(BUBALUS BUBALIS)", 
		"Also known as water buffalo or Asian buffalo to prevent confusion with the American bison. The water buffalo comprises two subspecies: The rive buffalo ( B. bubalis bubalis) and the swamp buffalo (B. bubalis kerebau).", 
		"Buffalo Milk", 
		"Buffalo milk has a higher fat, protein, lactose, vitamin, and mineral content than cow’s milk. It’s also whiter and has a thicker consistency, which makes it perfect for the production of fat-based dairy products.",
			new String[]{ //benefits
				"May provide antioxidant activity",
				"May Support bone health",
				"May improve heart health"
			},
			new String[]{ //nutrition facts
				"Calories: 237g",
				"Protein: 9.2g",
				"Carbohydrates: 13g",
				"Fat: 17g",
				"Calcium: 47% of DV"
			},
			new String[]{ //Best for
				"Mild allergy to cow’s milk.",
				"Substitute for protein shakes.",
				"People with high cholesterol."
			},
			new String[]{ //brand1
				"Buffy’s Philippines",
				"images/BB.png",
				"https://goo.su/Uab0",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"DVF Dairy Farm Gatas Ng Kalabaw",
				"images/DB.png",
				"https://goo.su/yXoXzx",
				"https://goo.su/PKtUk",
				"N/A"
			},
			new String[]{//brand3
				"Organic Raw Carabao Milk",
				"images/OB.png",
				"https://goo.su/Ijn2qUW",
				"https://goo.su/YyJgcBG",
				"N/A"
			});

		Milk goatMilk = new Milk(
		"GOAT", 
		"images/Goat.jpg", 
		"(Capra Aegragrus Hircus)", 
		"It is a domesticated species of goat antelope often raised as livestock. It originated from the Capra Aegragrus, a wild goat native to southwest Asia and parts of Eastern Europe.", 
		"Goat Milk", 
		"Goat milk is thicker and creamier than cow milk or plant milks, and goat milk has more nutrients that may offer health benefits.",
			new String[]{ //benefits
				"Easier to digest",
				"Less risk of milk allergies",
				"Better heart health"
			},
			new String[]{ //nutrition facts
				"Calories: 168",
				"Protein: 8.7g",
				"Carbohydrates: 10.9g",
				"Fat: 10.1g",
				"Calcium: 33% of DV"
			},
			new String[]{ //Best for
				"People with insulin issues.",
				"People with high cholesterol.",
				"People trying to gain weight."
			},
			new String[]{ //brand1
				"DG Goat Milk",
				"images/DG.png",
				"https://goo.su/xKZiPS",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Alaminos Milk Star Goat’s Milk",
				"images/AG.png",
				"https://goo.su/MShY",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Meyenberg Goat Milk ",
				"images/MG.png",
				"https://goo.su/tAXdz",
				"https://goo.su/3Wv2B",
				"N/A"
			});
		
		
		Milk sheepMilk = new Milk(
		"SHEEP", 
		"images/sheep.jpg", 
		"(OVIS ARIES)", 
		"Sheep, (Ovis aries), species of domesticated ruminant (cud-chewing) mammal, raised for its meat, milk, and wool. The sheep is usually stockier than its relative the goat (genus Capra).", 
		"Sheep Milk", 
		"Sheep milk is highly nutritious, richer in vitamins A, B, and E, calcium, phosphorus, potassium, and magnesium than cow's milk. It contains a higher proportion of short- and medium-chain fatty acids.",
			new String[]{ //benefits
				"Can help improve digestion and reduce inflammation.",
				"It is an excellent source of healthy fats.",
				"Linked to increased bone mineral density."
			},
			new String[]{ //nutrition facts
				"Calories: 237",
				"Protein: 12.8g",
				"Carbohydrates: 14.8g",
				"Fat: 13.8g",
				"Calcium: 43% of DV"
			},
			new String[]{ //Best for
				"Lactose Intolerant People.",
				"People with allergies.",
				"People who are looking to maintain a healthy lifestyle."
			},
			new String[]{ //brand1
				"Hozier Milk Farm",
				"images/sh.png",
				"https://goo.su/VpbtFxz",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"N/A",
				"images/NA.png",
				"N/A",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"N/A",
				"images/NA.png",
				"N/A",
				"N/A",
				"N/A"
			});
		
		Milk breastMilk = new Milk(
		"Breast", 
		"images/boob.jpg", 
		"(Colostrum)", 
		"first milk a human body produces during pregnancy. It forms in the mammary glands (breasts) and plays an important role in building a baby's immune system..", 
		"Breast Milk", 
		" the primary source of nutrition for newborns, containing fat, protein, carbohydrates (lactose and human milk oligosaccharides) and variable minerals and vitamins..",
			new String[]{ //benefits
				"Healthy nutrients.",
				"Preventing infections.",
				"Preventing other sickness/conditions."
			},
			new String[]{ //nutrition facts
				"Potassium: 600mg",
				"Protein: 15g",
				"Carbohydrates: 14.8g",
				"Fat: 17g",
				"Calcium: 250mg"
			},
			new String[]{ //Best for
				"Infants(new born or upto 2 yrs old).",
				"Those who want to be a child again.",
				"Weirdos."
			},
			new String[]{ //brand1
				"Breast Milk for Sale Commonwealth QC",
				"images/bM.png",
				"https://goo.su/2FSVl",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"BreastMilk PH",
				"images/bM1.png",
				"https://goo.su/hmJgz",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"BreastMilk Liquid Gold",
				"images/bM2.png",
				"https://goo.su/QJvQb",
				"N/A",
				"N/A"
			});
		
		Milk.milks.add(almondMilk);
		Milk.milks.add(riceMilk);
		Milk.milks.add(oatMilk);
		Milk.milks.add(coconutMilk);
		Milk.milks.add(soyMilk);
		Milk.milks.add(camelMilk);
		Milk.milks.add(wholeMilk);
		Milk.milks.add(lowFat);
		Milk.milks.add(skimMilk);
		Milk.milks.add(lactoseMilk);
		Milk.milks.add(organicMilk);
		Milk.milks.add(reducedMilk);
		Milk.milks.add(flavoredMilk);
		Milk.milks.add(buffaloMilk);
		Milk.milks.add(goatMilk);
		Milk.milks.add(sheepMilk);
		Milk.milks.add(breastMilk);
	}

}
