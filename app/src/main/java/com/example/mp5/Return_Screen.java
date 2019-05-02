package com.example.mp5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;

public final class Return_Screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_page);
        TextView first_disease = findViewById(R.id.First_disease);
        first_disease.setText(first_disease());
        TextView first_description = findViewById(R.id.First_Description);
        first_description.setText(FirstDescription());
        TextView second_disease = findViewById(R.id.Second_disease);
        second_disease.setText(Second_disease());
        TextView second_description = findViewById(R.id.Second_description);
        second_description.setText(Second_description());
    }
    public String Second_description() {
        TextView first_disease = findViewById(R.id.First_Description);
        String first = first_disease.getText().toString();
        String possible = getIntent().getExtras().getString("First");
        String second_possible = getIntent().getExtras().getString("Second");
        List<String> possibles = new ArrayList<>();
        possibles.add(0,possible);
        possibles.add(1, second_possible);
        set_all();
        setList();
        for (int i = 0; i < Diseases.size(); i++) {
            if (!(Diseases.get(i).get(2).equals(first))) {
                if ((possibles.get(0).equals(Diseases.get(i).get(0))) &&
                        (possibles.get(1).equals(Diseases.get(i).get(1))) ||
                        (possibles.get(0).equals(Diseases.get(i).get(1))) &&
                                (possibles.get(1).equals(Diseases.get(i).get(0)))) {
                    return Diseases.get(i).get(3);
                }
            }
            for (int j = 0; j < Diseases.size(); j++) {
                if (j == i) {
                    continue;
                }
                if (possibles.get(0).equals(Diseases.get(j).get(0))) {
                    return Diseases.get(j).get(3);
                }
            }
        }
        return null;
    }
    public String Second_disease() {
        TextView first_disease = findViewById(R.id.First_Description);
        String first = first_disease.getText().toString();
        String possible = getIntent().getExtras().getString("First");
        String second_possible = getIntent().getExtras().getString("Second");
        List<String> possibles = new ArrayList<>();
        possibles.add(0,possible);
        possibles.add(1, second_possible);
        set_all();
        setList();
        for (int i = 0; i < Diseases.size(); i++) {
            if (!(Diseases.get(i).get(2).equals(first))) {
                if ((possibles.get(0).equals(Diseases.get(i).get(0))) &&
                        (possibles.get(1).equals(Diseases.get(i).get(1))) ||
                        (possibles.get(0).equals(Diseases.get(i).get(1))) &&
                        (possibles.get(1).equals(Diseases.get(i).get(0)))) {
                    return Diseases.get(i).get(2);
                }
            }
            for (int j = 0; j < Diseases.size(); j++) {
                if (j == i) {
                    continue;
                }
                if (possibles.get(0).equals(Diseases.get(j).get(0))) {
                    return Diseases.get(j).get(2);
                }
            }
        }
        return null;
    }
    public String FirstDescription() {
        String possible = getIntent().getExtras().getString("First");
        String second_possible = getIntent().getExtras().getString("Second");
        List<String> possibles = new ArrayList<>();
        possibles.add(0,possible);
        possibles.add(1, second_possible);
        set_all();
        setList();
        for (int i = 0; i < Diseases.size(); i++) {
            if ((possibles.get(0).equals(Diseases.get(i).get(0))) &&
                    (possibles.get(1).equals(Diseases.get(i).get(1))) ||
                    (possibles.get(0).equals(Diseases.get(i).get(1))) &&
                            (possibles.get(1).equals(Diseases.get(i).get(0)))) {
                return Diseases.get(i).get(3);
            }
        }
        return null;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onClickMap(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public String first_disease() {
        String possible = getIntent().getExtras().getString("First");
        String second_possible = getIntent().getExtras().getString("Second");
        List<String> possibles = new ArrayList<>();
        possibles.add(0,possible);
        possibles.add(1, second_possible);
        set_all();
        setList();
        for (int i = 0; i < Diseases.size(); i++) {
            if ((possibles.get(0).equals(Diseases.get(i).get(0))) &&
                    (possibles.get(1).equals(Diseases.get(i).get(1))) ||
                    (possibles.get(0).equals(Diseases.get(i).get(1))) &&
                    (possibles.get(1).equals(Diseases.get(i).get(0)))) {
                return Diseases.get(i).get(2);
            }
        }
        return null;
    }
    private final List<List<String>> Diseases = new ArrayList<>();
    private final List<String> Asthma = new ArrayList<>();
    private final List<String> Acute_Sinusitis = new ArrayList<>();
    private final List<String> Influenza = new ArrayList<>();
    private final List<String> Common_Cold = new ArrayList<>();
    private final List<String> Heartburn_GERD = new ArrayList<>();
    private final List<String> Viral_Pneumonia = new ArrayList<>();
    private final List<String> Strep_Throat = new ArrayList<>();
    private final List<String> Irritable_Bowel_Syndrome = new ArrayList<>();
    private final List<String> Viral_Gastroenteritis = new ArrayList<>();
    private final List<String> Lactose_Intolerance = new ArrayList<>();
    private final List<String> Heat_Cramps = new ArrayList<>();
    private final List<String> Chronic_Kidney_Disease = new ArrayList<>();
    private final List<String> Costochondritis = new ArrayList<>();
    private final List<String> BPPV = new ArrayList<>();
    private final List<String> Labyrinthitis = new ArrayList<>();
    private final List<String> Drug_Allergy = new ArrayList<>();
    private final List<String> Pulmonary_Embolism = new ArrayList<>();
    private final List<String> Hay_Fever = new ArrayList<>();
    private final List<String> Major_Depression = new ArrayList<>();
    private final List<String> Gastritis = new ArrayList<>();
    private final List<String> Intestinal_Obstruction = new ArrayList<>();

    public void set_all() {
        Asthma.add(0, "Cough");
        Asthma.add(1, "Cough");
        Asthma.add(2, "Asthma");
        Asthma.add(3, "Asthma is a lung condition  that causes airways to swell and become inflamed. Asthma makes it hard to breathe. Some people may have minor symptoms, but others may have severe symptoms that interfere with daily life. Having severe asthma may put you at risk for a life-threatening asthma attack. Symptoms of an asthma attack include wheezing, chest tightness, coughing, and shortness of breath. Asthma is a lifelong condition that can be managed but not cured. Avoiding asthma triggers and taking medication help most people avoid attacks and keep symptoms under control.");
        Acute_Sinusitis.add(0, "Congestion");
        Acute_Sinusitis.add(1, "Cough");
        Acute_Sinusitis.add(2, "Acute Sinusitis");
        Acute_Sinusitis.add(3, "Acute sinusitis is an inflammation of the sinuses caused by infection lasting less than 4 weeks. Sinusitis often develops when swelling, inflammation, and mucus from a cold block nasal passages. This makes it easier for bacteria to grow. Organisms can produce gas, and when your sinuses are not draining, pressure can quickly build up and cause the infection to spread. Viruses are the most common cause of acute sinusitis, but bacteria, fungi, and allergies may also cause it. Sinus pain and tenderness are common, but severe pain may indicate an abscess or other complication.");
        Influenza.add(0, "Fever");
        Influenza.add(1, "Cough");
        Influenza.add(2, "Influenza");
        Influenza.add(3, "The flu is a respiratory tract infection caused by the influenza virus. Flu symptoms include fever, sore throat, runny nose, headache, cough, muscle aches, and fatigue. The flu spreads easily from person to person. Most people recover at home with rest and over-the-counter medications, but for some people flu can be severe and even life-threatening. Young children, older adults, pregnant women, and people with health problems are at risk for complications from the flu, such as pneumonia. Prescription antiviral medication can lessen symptoms and help speed recovery. Getting a yearly flu vaccine is the best way to prevent the flu.");
        Common_Cold.add(0, "Cough");
        Common_Cold.add(1, "Fever");
        Common_Cold.add(2, "Common Cold");
        Common_Cold.add(3, "The common cold is a short-lived viral infection of the upper respiratory tract, which includes the nose and sinuses, mouth, and throat. Symptoms may include sore throat, stuffy or runny nose, nasal drip, headache, and slight muscle aches. Because more than 200 viruses cause colds, and new ones develop all the time, the body can't build immunity to colds. Colds spread easily from person to person and are the most common illness in the world. Most colds go away within a few days and don't cause serious health problems.");
        Heartburn_GERD.add(0, "Heartburn");
        Heartburn_GERD.add(1, "Cough");
        Heartburn_GERD.add(2, "Heartburn/GERD");
        Heartburn_GERD.add(3, "Heartburn happens when stomach acid backs up into your esophagus, irritating the lining of the esophagus. Heartburn causes a burning sensation in your mouth or chest or a sour taste in your mouth. Mild, occasional heartburn usually isn't a problem. Heartburn that happens frequently is called gastroesophageal reflux disorder, or GERD.  It is also possible to have GERD without symptoms of discomfort in your chest.  GERD without symptoms has been linked to causing ear infections, sinus infection, excessive mucus in the throat. Over time, GERD can wear away at your esophagus and increase your risk for esophageal cancer and other problems.");
        Viral_Pneumonia.add(0, "Fever");
        Viral_Pneumonia.add(1, "Fever");
        Viral_Pneumonia.add(2, "Viral Pneumonia");
        Viral_Pneumonia.add(3, "Viral pneumonia is a lung infection caused by viruses. Viral pneumonia symptoms can be mild or life-threatening and include cough, shortness of breath, wheezing, chest pain, fever, and chills. Older adults, young children, people with a weak immune system, and those with chronic medical conditions are more at risk for complications from pneumonia. Treatment for pneumonia may include rest and self-care at home, or hospitalization and oxygen therapy, depending on the severity of symptoms. Antiviral medications can treat pneumonia caused by the influenza virus. Most people recover from viral pneumonia in about 1 to 3 weeks.");
        Strep_Throat.add(0, "Vomiting");
        Strep_Throat.add(1, "Fever");
        Strep_Throat.add(2, "Strep Throat");
        Strep_Throat.add(3, "Strep throat is a throat infection caused by streptococcal bacteria. Symptoms include a red throat, white patches on the throat, a sore throat, trouble swallowing, swollen lymph glands, and a fever. Symptoms are often more severe than with a viral sore throat. Strep throat occurs most often in children ages 5-15, but anyone can get it. Some children have a reaction to the strep bacteria that causes a rash called scarlet fever. Strep throat spreads from person to person from contact with saliva or nasal secretions. If not treated, strep throat may lead to serious health problems such as rheumatic fever, kidney problems, middle ear infections, meningitis, and throat abscess. Antibiotics treat strep throat and scarlet fever and help prevent these rare but serious conditions.");
        Irritable_Bowel_Syndrome.add(0, "Diarrhea");
        Irritable_Bowel_Syndrome.add(1, "Headache");
        Irritable_Bowel_Syndrome.add(2, "Irritable Bowel Syndrome");
        Irritable_Bowel_Syndrome.add(3, "Irritable bowel syndrome is a common condition that causes painful spasms and cramping in the large intestine (colon). IBS does not harm the intestines, and it does not increase the risk for cancer or for other serious stomach problems. Pain from IBS can be severe and is the main cause of stomach pain complaints in emergency rooms.");
        Lactose_Intolerance.add(0, "Diarrhea");
        Lactose_Intolerance.add(1, "Diarrhea");
        Lactose_Intolerance.add(2, "Lactose Intolerance");
        Lactose_Intolerance.add(3, "Lactose is a type of sugar found in dairy products. Lactose intolerance occurs in people who don't produce lactase, the enzyme that digests lactose. Undigested lactose ferments in the colon, leading to gas, bloating, and other symptoms. Some people produce less lactase as they get older. Diseases that affect the stomach lining, infections of the small intestine, and bowel surgery can affect how much lactase is available to digest lactose. Some people with lactose intolerance can eat small amounts of dairy. Lactase supplements can help people with severe intolerance to dairy products.");
        Viral_Gastroenteritis.add(0, "Diarrhea");
        Viral_Gastroenteritis.add(1, "Vomiting");
        Viral_Gastroenteritis.add(2, "Viral Gastroenteritis");
        Viral_Gastroenteritis.add(3, "Gastroenteritis is inflammation of the stomach and intestines caused by viruses. Gastroenteritis symptoms include abdominal pain and cramping, nausea, diarrhea, and vomiting. Although it's sometimes called the stomach flu, the flu virus does not cause gastroenteritis. The illness usually spreads easily from contact with a sick person. Eating or drinking contaminated food or beverages will also spread the illness. Most people recover in a few days by drinking plenty of fluids and resting. Infants, older adults, and people with chronic illnesses are at higher risk for dehydration from gastroenteritis.");
        Heat_Cramps.add(0, "Cramps");
        Heat_Cramps.add(1, "Cramps");
        Heat_Cramps.add(2, "Heat Cramps");
        Heat_Cramps.add(3, "Heat cramps are muscle pains or spasms caused by intense sweating, usually during exercise. They are most likely to occur in the abdomen, arms, or legs. Heat cramps almost always go away on their own if you stop exercising, rest in a cool place, and drink plenty of fluid with electrolytes.");
        Chronic_Kidney_Disease.add(0, "Appetite Loss");
        Chronic_Kidney_Disease.add(1, "Cramps");
        Chronic_Kidney_Disease.add(2, "Chronic Kidney Disease");
        Chronic_Kidney_Disease.add(3, "Heat cramps are muscle pains or spasms caused by intense sweating, usually during exercise. They are most likely to occur in the abdomen, arms, or legs. Heat cramps almost always go away on their own if you stop exercising, rest in a cool place, and drink plenty of fluid with electrolytes.");
        Costochondritis.add(0, "Heartburn");
        Costochondritis.add(1, "Cramps");
        Costochondritis.add(2, "Costochondritis");
        Costochondritis.add(3, "Costochondritis occurs when the cartilage connecting the ribs to the breastbone becomes inflamed. Pain affects one or both sides of the breastbone. Injury, a viral infection, or strain from coughing can trigger the condition. Diseases such as arthritis and fibromyalgia also may cause costochondritis. Usually, there is no clear cause. While harmless, the condition often is mistaken for a heart attack. Costochondritis affects women more than men and usually goes away on its own within a few days or weeks.");
        Drug_Allergy.add(0, "Dizziness");
        Drug_Allergy.add(1, "Appetite Loss");
        Drug_Allergy.add(2, "Drug Allergy");
        Drug_Allergy.add(3, "A drug allergy is an allergic reaction to a medication. Penicillin, sulfa drugs, barbiturates, aspirin, nonsteroidal and antiseizure medications, and contrast dye materials commonly cause it. Injecting a drug is more likely to cause a reaction than taking it orally. The most severe allergic reaction is anaphylaxis, which involves the whole body. You may have difficulty breathing, rapid heartbeat, or lose consciousness. Anaphylaxis must be treated in an emergency room. Other drug allergy symptoms can range from mild itching and hives to fever and vomiting. Prescription or over-the-counter medication and stopping the offending medication can usually clear up a reaction.");
        BPPV.add(0, "Dizziness");
        BPPV.add(1, "Dizziness");
        BPPV.add(2, "Benign Paroxysmal positional vertigo (BPPV)");
        BPPV.add(3, "BPPV (benign paroxysmal positional vertigo) is usually a temporary condition that affects balance and your sense of position. It's brought on by changes of head position that cause a sudden sense of spinning, known as vertigo. The dizziness comes from shifts in calcium crystals in the inner ear that normally help the brain know where you are in relation to things around you. But with BPPV the signals are exaggerated. When the crystals shift, the result is a sensation that either you or the room is spinning. Most often, its cause is unknown. Along with the sensation of spinning, or vertigo, BPPV may cause nausea and sometimes vomiting.");
        Labyrinthitis.add(0, "Dizziness");
        Labyrinthitis.add(1, "Dizziness");
        Labyrinthitis.add(2, "Labyrinthitis");
        Labyrinthitis.add(3, "Labyrinthitis is an infection and swelling in the inner ear. Usually, viruses cause labyrinthitis. Labyrinthitis may cause vertigo -- dizziness, loss of balance, nausea, vomiting -- and sometimes hearing loss. An inner ear infection is different from common childhood ear infections. Those are typically caused by bacteria in the middle ear.");
        Pulmonary_Embolism.add(0, "Heartburn");
        Pulmonary_Embolism.add(1, "Dizziness");
        Pulmonary_Embolism.add(2, "Pulmonary Embolism");
        Pulmonary_Embolism.add(3, "A pulmonary embolism is a blood clot that forms in a vein, usually in the calf, travels to the lung, and lodges there. You may have shortness of breath, even while resting, or feel as if you're having a heart attack. It is an emergency, because one large pulmonary embolism or several small ones can be fatal. Blood-thinning medication is the standard treatment. Most people who are treated for pulmonary embolism survive. Those who are older, have an underlying illness, or do not get diagnosed promptly are at greater risk of dying.");
        Hay_Fever.add(0, "Appetite Loss");
        Hay_Fever.add(1, "Congestion");
        Hay_Fever.add(2, "Hay Fever");
        Hay_Fever.add(3, "Hay fever is an allergic reaction to outdoor pollens and molds. An allergic reaction occurs when the body overreacts to a foreign substance. This causes nasal congestion, itchy eyes, runny nose, and other symptoms. Hay fever occurs most often in spring. Symptoms tend to last a few weeks but may continue into summer or fall if you have other allergies, such as grass pollen or leaf mold. Medications to reduce swelling and inflammation and keep nasal passages clear relieve hay fever symptoms and may help prevent sinus infections.");
        Major_Depression.add(0, "Appetite Loss");
        Major_Depression.add(1, "Appetite Loss");
        Major_Depression.add(2, "Major Depression");
        Major_Depression.add(3, "A constant sense of hopelessness and despair is a sign you may have major depression, also known as clinical depression.With major depression, it may be difficult to work, study, sleep, eat, and enjoy friends and activities. Some people have clinical depression only once in their life, while others have it several times in a lifetime.Major depression can sometimes occur from one generation to the next in families, but often it may affect people with no family history of the illness.");
        Gastritis.add(0, "Heartburn");
        Gastritis.add(1, "Appetite loss");
        Gastritis.add(2, "Gastritis");
        Gastritis.add(3, "Gastritis is an inflammation of the stomach lining that can be caused by H. pylori bacteria, NSAIDs and or alcohol, and can be aggravated by spicy foods, stress, and excess acid. Gastritis causes stomach upset, irritation, and pain that can last just minutes or for hours. In some people, gastritis becomes a chronic problem.");
        Intestinal_Obstruction.add(0, "Vomiting");
        Intestinal_Obstruction.add(1, "Appetite Loss");
        Intestinal_Obstruction.add(2, "Intestinal Obstruction");
        Intestinal_Obstruction.add(3, "Intestinal obstruction happens when part of the intestine is partially or completely blocked. Waste, fluid, and gas build up in the intestine because they can't get out of the body. You may have pain, constipation, or vomiting. If the blockage isn't cleared up, it can cut off the blood supply to the intestine, which can be fatal. With immediate hospital treatment, most people fully recover.");
    }
    public void setList() {
        Diseases.add(Asthma);
        Diseases.add(Acute_Sinusitis);
        Diseases.add(Influenza);
        Diseases.add(Common_Cold);
        Diseases.add(Heartburn_GERD);
        Diseases.add(Viral_Gastroenteritis);
        Diseases.add(Viral_Pneumonia);
        Diseases.add(Gastritis);
        Diseases.add(Intestinal_Obstruction);
        Diseases.add(Hay_Fever);
        Diseases.add(Pulmonary_Embolism);
        Diseases.add(Drug_Allergy);
        Diseases.add(BPPV);
        Diseases.add(Labyrinthitis);
        Diseases.add(Costochondritis);
        Diseases.add(Heat_Cramps);
        Diseases.add(Chronic_Kidney_Disease);
        Diseases.add(Lactose_Intolerance);
        Diseases.add(Irritable_Bowel_Syndrome);
        Diseases.add(Strep_Throat);
        Diseases.add(Major_Depression);
    }
}
