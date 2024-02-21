package OOP_Project.model;

import java.util.ArrayList;

public class SearchData {
    public static ArrayList<String> datas = new ArrayList<>();
    public static ArrayList<String> milkNames = new ArrayList<>();
    private String gender, age , status, condition, level;
    public SearchData(String gender, String age, String status, String condition, String level){
        this.gender = gender;
        this.age = age;
        this.status = status;
        this.condition = condition;
        this.level=level;

        if (age.equals("Infancy (Birth to 2 years old)")) {
            // HUMAN-BASED MILK
            if (getVeget().equals("Unidentified") && getHealth().equals("None") && (getSugar().equals("All Sugar Levels") 
            || getSugar().equals("Unsweetened (0%)") || getSugar().equals("Low Sugar (less than 5%)"))) {
               SearchData.milkNames.add(SearchData.datas.get(16)); // Breast Milk
            } 
         }
   
         else {
            if (!getVeget().equals("Ovo-vegetarian") && !getVeget().equals("Vegan")) { 
               // ANIMAL-BASED MILK
               if (getSugar().equals("All Sugar Levels") || getSugar().equals("Low Sugar (less than 5%)")) { 
                  if (!getHealth().equals("Milk Allergy") && !getHealth().equals("Lactose Intolerance")) {
                     SearchData.milkNames.add(SearchData.datas.get(0)); // Buffalo Milk
                     SearchData.milkNames.add(SearchData.datas.get(1)); // Camel Milk
                     SearchData.milkNames.add(SearchData.datas.get(6)); // Organic Cow Milk
                     SearchData.milkNames.add(SearchData.datas.get(8)); // Sheep Milk
                     SearchData.milkNames.add(SearchData.datas.get(9)); // Skimmed Cow Milk
                  }
   
                  if (!getHealth().equals("Milk Allergy") || !getHealth().equals("High Cholesterol") 
                     || !getHealth().equals("Lactose Intolerance")) {
                        SearchData.milkNames.add(SearchData.datas.get(3)); // Goat Milk
                  }
               }
   
               if (getSugar().equals("All Sugar Levels") || getSugar().equals("Unsweetened (0%)")
                  || getSugar().equals("Low Sugar (less than 5%)")) {
                     if (!getHealth().equals("Milk Allergy") && !getHealth().equals("Lactose Intolerance")) {
                        SearchData.milkNames.add(SearchData.datas.get(7)); // Reduced Fat Cow Milk
                        SearchData.milkNames.add(SearchData.datas.get(10)); // Whole Cow Milk
                     }
               }
   
               if (getSugar().equals("All Sugar Levels") || getSugar().equals("Unsweetened (0%)")) {
                  if (!getHealth().equals("Milk Allergy") && !getHealth().equals("Lactose Intolerance")) {
                     SearchData.milkNames.add(SearchData.datas.get(5)); // Low-fat Cow Milk
                  }
               }
   
               if (!getSugar().equals("Unsweetened (0%)") && !getSugar().equals("Low Sugar (less than 5%)")) {
                  if (!getHealth().equals("Milk Allergy") && !getHealth().equals("Lactose Intolerance")
                     && !getHealth().equals("Diabetic")) {
                        SearchData.milkNames.add(SearchData.datas.get(2)); // Flavored Cow Milk
                  }
               } 
   
               else {
                  if (!getHealth().equals("Milk Allergy") && !getHealth().equals("High Cholesterol")) {
                     SearchData.milkNames.add(SearchData.datas.get(4)); // Lactose-free Cow Milk
                  }
               }
            }
   
            else {
               // PLANT-BASED MILK
               if (getSugar().equals("All Sugar Levels") || getSugar().equals("Unsweetened (0%)")
                  || getSugar().equals("Low Sugar (less than 5%)")) {
                     if (!getHealth().equals("Nut Allergy") && !getHealth().equals("Kidney Issues")) {
                        SearchData.milkNames.add(SearchData.datas.get(11)); // Almond Milk
                     }
   
                     if (!getHealth().equals("Soy Allergy") && !getHealth().equals("Thyroid Issues")) {
                        SearchData.milkNames.add(SearchData.datas.get(15)); // Soy Milk
                     }
               }
   
               if (getSugar().equals("All Sugar Levels") || getSugar().equals("Unsweetened (0%)")) {
                  if (!getHealth().equals("Coconut Allergy")) {
                     SearchData.milkNames.add(SearchData.datas.get(12)); // Coconut Milk
                  }
   
                  if (!getHealth().equals("Rice Allergy") && !getHealth().equals("Arsenic Concerns")
                     && !getHealth().equals("Nutritional Deficiencies")) {
                        SearchData.milkNames.add(SearchData.datas.get(14)); // Rice Milk
                  }
               }
   
               if (getSugar().equals("All Sugar Levels") || getSugar().equals("Low Sugar (less than 5%)")) {
                  if (!getHealth().equals("Oat Allergy")) {
                    SearchData.milkNames.add(SearchData.datas.get(13)); // Oat Milk
                  }
               }
            }
         }
    }
    public String getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getVeget(){
        return status;
    }
    public String getSugar(){
        return level;
    }
    public String getHealth(){
        return condition;
    }

    public static void createData(){
        SearchData.datas.add("Buffalo Milk");
        SearchData.datas.add("Camel Milk");
        SearchData.datas.add("Flavored Cow Milk");
        SearchData.datas.add("Goat Milk");
        SearchData.datas.add("Lactose-free Cow Milk");
        SearchData.datas.add("Low-fat Milk");
        SearchData.datas.add("Organic Cow Milk");
        SearchData.datas.add("Reduced Fat Cow Milk");
        SearchData.datas.add("Sheep Milk");
        SearchData.datas.add("Skimmed Cow Milk");
        SearchData.datas.add("Whole Cow Milk");
        SearchData.datas.add("Almond Milk");
        SearchData.datas.add("Coconut Milk");
        SearchData.datas.add("Oat Milk");
        SearchData.datas.add("Rice Milk");
        SearchData.datas.add("Soy Milk");
        SearchData.datas.add("Breast Milk");
    }
}
