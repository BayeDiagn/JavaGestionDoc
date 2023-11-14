

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class gestionController implements Initializable{
	
	@FXML
    private FontAwesomeIconView bars;

    @FXML
    private FontAwesomeIconView close;

    @FXML
    private Pane leftPane;
    
    @FXML
    private Pane centerPane1;
    
    @FXML
    private Pane centerPane2;
    
    @FXML
    private Pane centerPane3;
    
    @FXML
    private Pane centerPane4;
    
    @FXML
    private Pane centerPane5;
    
    @FXML
    private Pane centerPane6;
    
    @FXML
    private Label titre;
    
    //------------------------------liceence1-----------------------------------------------------------------------
   //-------------------------------Semestre1----------------------------
    
    @FXML
    private TreeTableColumn<PDFFile, String> coursL1;
    @FXML
    private TreeTableColumn<PDFFile, String> anneeL1;   
    @FXML
    private TreeTableView<PDFFile> tableL1;
 

    @SuppressWarnings({ "unchecked", "null", "rawtypes" })
	@FXML
    void ato(MouseEvent event) {
    	
    		tableL1.setVisible(true);
    		titre.setVisible(true);
    		titre.setText("Architecture et Technologie des Ordinateurs");
    			
    		coursL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
    		anneeL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
    			    		
    		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
    		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
    		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
    		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null)); 
    		
    		//List<PDFFile> listcours = null;
    		
    		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I", null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/ATO/Chap1.pdf"));
    		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE II", null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/ATO/Chap2.pdf"));
    		TreeItem<PDFFile> cours4 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE IV", null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/ATO/Chap4.pdf"));
    		TreeItem<PDFFile> cours5 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE V", null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/ATO/Chap5.pdf"));
    		cours.getChildren().addAll(cours1,cours2,cours4,cours5);
    		
    		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
    		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
    		examen.getChildren().addAll(examen1,examen2);
    		
    		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("TD1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/ATO/td1.pdf"));
    		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
    		td_tp.getChildren().addAll(tdtp1,tdtp2);
    		
    		doc.getChildren().addAll(cours,examen,td_tp);
    		tableL1.setRoot(doc);
    		tableL1.setShowRoot(false);    		
    		
    	    tableL1.setOnMouseClicked(ex -> {
    	        if (ex.getClickCount() == 2) {
    	            PDFFile selectedFile = tableL1.getSelectionModel().getSelectedItem().getValue();
    	            if(selectedFile!=null)
    	            openPDFFile(selectedFile.getChemin());
      	        }
    	    });
    	}

    	private void openPDFFile(String chemin) {
    	       	    
            if (chemin != null && !chemin.isEmpty()) {
            	 File pdfFile = new File(chemin);
            	 
            	 if (pdfFile.exists()) {
         	        try {
         	            Desktop.getDesktop().open(pdfFile);
         	        } catch (IOException e) {
         	            e.printStackTrace();
         	        }
         	    }
            	// else System.out.println("fichier n'existe pas");
 
            }
            //else System.out.println("chemin introuvable");	    

    }
   
    @SuppressWarnings("unchecked")
	@FXML
    void se(MouseEvent event) {
    	tableL1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Systeme d'Exploitation");
		
		coursL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		anneeL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
				
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS COMPLET",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/SE/CoursSEcompletMrGaye.pdf"));
		cours.getChildren().addAll(cours1);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen3", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen4", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<>(new PDFFile("TD1", "2020-2021","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/SE/TD!-SE 2020-2021.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2022","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		tableL1.setRoot(doc);
		
		
	    tableL1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = tableL1.getSelectionModel().getSelectedItem().getValue();
	            	openPDFFile(selectedFile.getChemin());
	        }
	    });
    	

      }
    
    @SuppressWarnings("unchecked")
	@FXML
    void algebre1(MouseEvent event) {
    	tableL1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Algebre I");
		
		coursL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		anneeL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		tableL1.setRoot(doc);
		
		
	    tableL1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = tableL1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void analyse1(MouseEvent event) {
    	tableL1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Analyse I");
		
		coursL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		anneeL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		tableL1.setRoot(doc);
		
		
	    tableL1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = tableL1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }   
    
    @SuppressWarnings("unchecked")
	@FXML
    void algo(MouseEvent event) {
    	tableL1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Algorithme");
		
		coursL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		anneeL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		tableL1.setRoot(doc);
		
		
	    tableL1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = tableL1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void anglais(MouseEvent event) {
    	tableL1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Anglais");
		
		coursL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		anneeL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		doc.getChildren().addAll(cours,examen);
		tableL1.setRoot(doc);
		
		
	    tableL1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = tableL1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void tec(MouseEvent event) {
    	tableL1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Technique d'Expression et de Communitation");
		
		coursL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		anneeL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		tableL1.setRoot(doc);
		
		
	    tableL1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = tableL1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void initiation(MouseEvent event) {
    	tableL1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Initiattion a l'informatique");
		
		coursL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		anneeL1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		tableL1.setRoot(doc);
		
		
	    tableL1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = tableL1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });
    }
    //--------------------------------------Semestre2---------------------------------------------
    	
    @FXML
    private TreeTableColumn<PDFFile, String> col1S2L1;
    @FXML
    private TreeTableColumn<PDFFile, String> col2S2L1;
    @FXML
    private TreeTableView<PDFFile> table1S2L1;
    
    @SuppressWarnings("unchecked")
	@FXML
    void SP(MouseEvent event) {
		table1S2L1.setVisible(true);
		titre.setVisible(true);
		titre.setText("Statistique et Probabilite");
		
		col1S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table1S2L1.setRoot(doc);
		
		
	    table1S2L1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table1S2L1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    @SuppressWarnings("unchecked")
	@FXML
    void TS(MouseEvent event) {
    	table1S2L1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Traitement de Signal");
		
		col1S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I", null ,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/TS/Cours1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE II",null ,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/TS/Cours2.pdf"));
		TreeItem<PDFFile> cours3 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE III", null ,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/TS/Cours3.pdf"));
		cours.getChildren().addAll(cours1,cours2,cours3);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table1S2L1.setRoot(doc);
		
		
	    table1S2L1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table1S2L1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
   
    @SuppressWarnings("unchecked")
	@FXML
    void algebre2(MouseEvent event) {
    	table1S2L1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Algebre II");
		
		col1S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table1S2L1.setRoot(doc);
		
		
	    table1S2L1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table1S2L1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
   
    @SuppressWarnings("unchecked")
	@FXML
    void analyse2(MouseEvent event) {
    	table1S2L1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Analyse II");
		
		col1S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table1S2L1.setRoot(doc);
		
		
	    table1S2L1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table1S2L1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void electonique(MouseEvent event) {
    	table1S2L1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Electricite");
		
		col1S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/Electricite/Chp1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE II",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/Electricite/Chp2.pdf"));
		TreeItem<PDFFile> cours3 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE III",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/Electricite/Chp3.pdf"));
		
		cours.getChildren().addAll(cours1,cours2,cours3);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table1S2L1.setRoot(doc);
		
		
	    table1S2L1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table1S2L1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void pascal(MouseEvent event) {
    	table1S2L1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Initiation a la Programmation");
		
		col1S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/Algo_II/Chap4.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE II",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/Algo_II/Chap5.pdf"));
		TreeItem<PDFFile> cours3 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE III",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/Algo_II/Chap6.pdf"));
		cours.getChildren().addAll(cours1,cours2,cours3);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table1S2L1.setRoot(doc);
		
		
	    table1S2L1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table1S2L1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }

    @SuppressWarnings("unchecked")
	@FXML
    void reseau(MouseEvent event) {
    	table1S2L1.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Reseaux");
		
		col1S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S2L1.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/Reseaux/Chap1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE II",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/Reseaux/Chap2.pdf"));
		TreeItem<PDFFile> cours3 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE III",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem2L1/Reseaux/Chap3.pdf"));
		cours.getChildren().addAll(cours1,cours2,cours3);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Algo_II/Chap4.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table1S2L1.setRoot(doc);
		
		
	    table1S2L1.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table1S2L1.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    //---------------------------------------Licence2-------------------------------------------------------------------
    //---------------------------------------Semestre3--------------------------
    @FXML
    private TreeTableColumn<PDFFile, String> col1S3L2;
    @FXML
    private TreeTableColumn<PDFFile, String> col2S3L2;
    @FXML
    private TreeTableView<PDFFile> table2S3L2;
    
    @SuppressWarnings("unchecked")
	@FXML
    void anglaisl2(MouseEvent event) {
      	table2S3L2.setVisible(true);
      	titre.setVisible(true);
		titre.setText("Anglais");
		
    		col1S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
    		col2S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
    		
    		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
    		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
    		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
    		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
    		
    		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
    		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
    		cours.getChildren().addAll(cours1,cours2);
    		
    		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
    		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
    		examen.getChildren().addAll(examen1,examen2);
    		
    		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
    		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
    		td_tp.getChildren().addAll(tdtp1,tdtp2);
    		
    		doc.getChildren().addAll(cours,examen,td_tp);
    		table2S3L2.setRoot(doc);
    		
    		
    	    table2S3L2.setOnMouseClicked(ex -> {
    	        if (ex.getClickCount() == 2) {
    	            PDFFile selectedFile = table2S3L2.getSelectionModel().getSelectedItem().getValue();
    	            openPDFFile(selectedFile.getChemin());
    	        }
    	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void elect(MouseEvent event) {
      	table2S3L2.setVisible(true);
      	titre.setVisible(true);
		titre.setText("Electronique");
		
    		col1S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
    		col2S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
    		
    		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
    		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
    		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
    		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
    		
    		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
    		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
    		cours.getChildren().addAll(cours1,cours2);
    		
    		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
    		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
    		examen.getChildren().addAll(examen1,examen2);
    		
    		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
    		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
    		td_tp.getChildren().addAll(tdtp1,tdtp2);
    		
    		doc.getChildren().addAll(cours,examen,td_tp);
    		table2S3L2.setRoot(doc);
    		
    		
    	    table2S3L2.setOnMouseClicked(ex -> {
    	        if (ex.getClickCount() == 2) {
    	            PDFFile selectedFile = table2S3L2.getSelectionModel().getSelectedItem().getValue();
    	            openPDFFile(selectedFile.getChemin());
    	        }
    	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void langageC(MouseEvent event) {
      	table2S3L2.setVisible(true);
      	titre.setVisible(true);
		titre.setText("Langage C");
		
    		col1S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
    		col2S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
    		
    		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
    		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
    		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
    		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
    		
    		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
    		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
    		cours.getChildren().addAll(cours1,cours2);
    		
    		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
    		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
    		examen.getChildren().addAll(examen1,examen2);
    		
    		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
    		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
    		td_tp.getChildren().addAll(tdtp1,tdtp2);
    		
    		doc.getChildren().addAll(cours,examen,td_tp);
    		table2S3L2.setRoot(doc);
    		
    		
    	    table2S3L2.setOnMouseClicked(ex -> {
    	        if (ex.getClickCount() == 2) {
    	            PDFFile selectedFile = table2S3L2.getSelectionModel().getSelectedItem().getValue();
    	            openPDFFile(selectedFile.getChemin());
    	        }
    	    });

    }

    @SuppressWarnings("unchecked")
	@FXML
    void linuxS3(MouseEvent event) {
    	table2S3L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Linux");
		
		col1S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S3L2.setRoot(doc);
		
		
	    table2S3L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S3L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void ro(MouseEvent event) {
    	table2S3L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Recherche Operationnelle");
		
		col1S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S3L2.setRoot(doc);
		
		
	    table2S3L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S3L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }

    @SuppressWarnings("unchecked")
	@FXML
    void rsf(MouseEvent event) {
    	table2S3L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Reseaux sans Fil");
		
		col1S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S3L2.setRoot(doc);
		
		
	    table2S3L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S3L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void serR(MouseEvent event) {
    	table2S3L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Services Reseau");
		
		col1S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S3L2.setRoot(doc);
		
		
	    table2S3L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S3L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void tecppp(MouseEvent event) {
    	table2S3L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Technique d'Expression & Projet professionnel Personnel");
		
		col1S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S3L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S3L2.setRoot(doc);
		
		
	    table2S3L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S3L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    //-----------------------------------------Semestre4--------------------------
    @FXML
    private TreeTableColumn<PDFFile, String> col1S4L2;
    @FXML
    private TreeTableColumn<PDFFile, String> col2S4L2;
    @FXML
    private TreeTableView<PDFFile> table2S4L2;
    
    @SuppressWarnings("unchecked")
	@FXML
    void javaL2(MouseEvent event) {
    	table2S4L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Java".toUpperCase());
		
		col1S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS COMPLET",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/java/java1 cours complet 2022.pdf"));
		cours.getChildren().addAll(cours1);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S4L2.setRoot(doc);
		
		
	    table2S4L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S4L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void adLinux(MouseEvent event) {
    	table2S4L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Administration Linux");
		
		col1S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S4L2.setRoot(doc);
		
		
	    table2S4L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S4L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }

    @SuppressWarnings("unchecked")
	@FXML
    void adWin(MouseEvent event) {
    	table2S4L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Administation Windows");
		
		col1S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS COMPLET",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/AdminWindows/Cours_Complet.pdf"));
		cours.getChildren().addAll(cours1);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/AdminWindows/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S4L2.setRoot(doc);
		
		
	    table2S4L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S4L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void bdt(MouseEvent event) {
    	table2S4L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Bases des Telecoms");
		
		col1S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I (Partie1)",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Telecom_RM/Chapitre 2 1 Supports de Transmission.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I (Partie2)",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Telecom_RM/Chapitre 2 2 Techniques de Transmission.pdf"));
		TreeItem<PDFFile> cours3 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I (Partie3)",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Telecom_RM/Chapitre 2 3 Multiplexeurs.pdf"));
		TreeItem<PDFFile> cours4 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE II (Partie1)",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Telecom_RM/Chapitre 3 1 Reseaux fixes.pdf"));
		TreeItem<PDFFile> cours5 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE II (Partie2)",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Telecom_RM/Chapitre 3 2 Evaluation Trafic.pdf"));
		cours.getChildren().addAll(cours1,cours2,cours3,cours4,cours5);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S4L2.setRoot(doc);
		
		
	    table2S4L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S4L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void maint(MouseEvent event) {
    	table2S4L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("MAintenance des Ordinateurs");
		
		col1S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S4L2.setRoot(doc);
		
		
	    table2S4L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S4L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void rm(MouseEvent event) {
    	table2S4L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Reseaux Moblies");

		
		col1S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I (Partie1)",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Telecom_RM/Chapitre 4 1 Reseaux Mobiles.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I (Partie2)",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Telecom_RM/Chapitre 4 2 Reseaux Mobile.pdf"));
		TreeItem<PDFFile> cours3 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I (Partie3)",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Telecom_RM/Chapitre 4 3 Reseaux Mobile.pdf"));
		TreeItem<PDFFile> cours4 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I (Partie4)",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Telecom_RM/Chapitre 4 4 Reseaux Mobile.pdf"));
		cours.getChildren().addAll(cours1,cours2,cours3,cours4);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S4L2.setRoot(doc);
		
		
	    table2S4L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S4L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void sibd(MouseEvent event) {
    	table2S4L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Base de Donnees");
		
		col1S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Basesdedonnees/Chap 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE II",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Basesdedonnees/Chap 2.pdf"));
		TreeItem<PDFFile> cours3 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE III",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Basesdedonnees/Chap 3.pdf"));
		TreeItem<PDFFile> cours4 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE IV",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Basesdedonnees/Chap 4.pdf"));
		TreeItem<PDFFile> cours5 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE V",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Basesdedonnees/Chap 5.pdf"));
		cours.getChildren().addAll(cours1,cours2,cours3,cours4,cours5);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/Basesdedonnees/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S4L2.setRoot(doc);
		
		
	    table2S4L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S4L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void web(MouseEvent event) {
    	table2S4L2.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Programmation Web");
		
		col1S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S4L2.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));
		
		TreeItem<PDFFile> htmlcss =new TreeItem<PDFFile>(new PDFFile("HTML_CSS", null, null));
		TreeItem<PDFFile> php =new TreeItem<PDFFile>(new PDFFile("PHP", null, null));
		cours.getChildren().addAll(htmlcss,php);
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE II",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/Chapitre 2.pdf"));
		TreeItem<PDFFile> cours3 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE III",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/Chapitre 3.pdf"));
		TreeItem<PDFFile> cours4 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE IV",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/Chapitre 4.pdf"));
		TreeItem<PDFFile> cours5 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE V",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/Chapitre 5.pdf"));
		TreeItem<PDFFile> cours6 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE VI",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/Chapitre 6.pdf"));
		TreeItem<PDFFile> cours7 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE VII",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/Chapitre 7.pdf"));
		TreeItem<PDFFile> cours8 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE VIII",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/Chapitre 8.pdf"));
		TreeItem<PDFFile> cours9 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE IX",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/Chapitre 9.pdf"));
		htmlcss.getChildren().addAll(cours1,cours2,cours3,cours4,cours5,cours6,cours7,cours8,cours9);
		
		
		TreeItem<PDFFile> cours01 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE I",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/PHP/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours02 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE II",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/PHP/Chapitre 2.pdf"));
		TreeItem<PDFFile> cours03 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE III",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/PHP/Chapitre 3.pdf"));
		TreeItem<PDFFile> cours04 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE IV",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/PHP/Chapitre 4.pdf"));
		TreeItem<PDFFile> cours05 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE V",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/PHP/Chapitre 5.pdf"));
		TreeItem<PDFFile> cours06 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE V PDO",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/PHP/Chapitre 5PDO.pdf"));
		TreeItem<PDFFile> cours07 =new TreeItem<PDFFile>(new PDFFile("CHAPITRE VI",null,"/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem4L2/HTML_CSS_PHP/PHP/Chapitre 6.pdf"));
		php.getChildren().addAll(cours01,cours02,cours03,cours04,cours05,cours06,cours07);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table2S4L2.setRoot(doc);
		
		
	    table2S4L2.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table2S4L2.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    //------------------------------------------Licence3-------------------------------------------------------------------
    
    //------------------------------------------Semestre5--------------------------
    @FXML
    private TreeTableColumn<PDFFile, String> col1S5L3;
    @FXML
    private TreeTableColumn<PDFFile, String> col2S5L3;
    @FXML
    private TreeTableView<PDFFile> table3S5L3;
    
    @SuppressWarnings("unchecked")
	@FXML
    void anglaisL3(MouseEvent event) {
    	table3S5L3.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Anglais Technique");
		
		col1S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table3S5L3.setRoot(doc);
		
		
	    table3S5L3.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table3S5L3.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void ddtic(MouseEvent event) {
    	table3S5L3.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Droit des Tics");

		
		col1S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table3S5L3.setRoot(doc);
		
		
	    table3S5L3.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table3S5L3.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void javaAva(MouseEvent event) {
    	table3S5L3.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Java Avance");
		
		col1S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table3S5L3.setRoot(doc);
		
		
	    table3S5L3.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table3S5L3.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void maintPer(MouseEvent event) {
    	table3S5L3.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Maintenace des Peripheriques");
		
		col1S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table3S5L3.setRoot(doc);
		
		
	    table3S5L3.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table3S5L3.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }

    @SuppressWarnings("unchecked")
	@FXML
    void metho(MouseEvent event) {
    	table3S5L3.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Methodologie");
		
		col1S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table3S5L3.setRoot(doc);
		
		
	    table3S5L3.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table3S5L3.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void resEten(MouseEvent event) {
    	table3S5L3.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Reseaux Etendus");
		
		col1S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table3S5L3.setRoot(doc);
		
		
	    table3S5L3.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table3S5L3.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void routage(MouseEvent event) {
    	table3S5L3.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Routage");
		
		col1S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table3S5L3.setRoot(doc);
		
		
	    table3S5L3.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table3S5L3.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void sec(MouseEvent event) {
    	table3S5L3.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Securite");

		
		col1S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S5L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table3S5L3.setRoot(doc);
		
		
	    table3S5L3.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table3S5L3.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    
    //------------------------------------------Semestre6--------------------------
    @FXML
    private TreeTableColumn<PDFFile, String> col1S6L3;
    @FXML
    private TreeTableColumn<PDFFile, String> col2S6L3;
    @FXML
    private TreeTableView<PDFFile> table3S6L3;
    
    @SuppressWarnings("unchecked")
	@FXML
    void langageUml(MouseEvent event) {
    	table3S6L3.setVisible(true);
    	titre.setVisible(true);
		titre.setText("Langage UML");
		
		col1S6L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S6L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table3S6L3.setRoot(doc);
		
		
	    table3S6L3.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table3S6L3.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void soutenance(MouseEvent event) {
	table3S6L3.setVisible(true);
	titre.setVisible(true);
	titre.setText("Sujet Soutenance");
		
		col1S6L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S6L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table3S6L3.setRoot(doc);
		
		
	    table3S6L3.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table3S6L3.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }
    
    @SuppressWarnings("unchecked")
	@FXML
    void gestionP(MouseEvent event) {
	table3S6L3.setVisible(true);
	titre.setVisible(true);
	titre.setText("Gestion de projet");
		
		col1S6L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("cours"));
		col2S6L3.setCellValueFactory(new TreeItemPropertyValueFactory<>("annee"));
		
		TreeItem<PDFFile> doc =new TreeItem<PDFFile>(new PDFFile("DOCUMENTS", null, null));   		
		TreeItem<PDFFile> cours =new TreeItem<PDFFile>(new PDFFile("COURS", null, null));
		TreeItem<PDFFile> examen =new TreeItem<PDFFile>(new PDFFile("EXAMEN", null, null));
		TreeItem<PDFFile> td_tp =new TreeItem<PDFFile>(new PDFFile("TD/TP", null, null));   		
		
		TreeItem<PDFFile> cours1 =new TreeItem<PDFFile>(new PDFFile("COURS1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> cours2 =new TreeItem<PDFFile>(new PDFFile("COURS 2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		cours.getChildren().addAll(cours1,cours2);
		
		TreeItem<PDFFile> examen1 =new TreeItem<PDFFile>(new PDFFile("examen1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> examen2 =new TreeItem<PDFFile>(new PDFFile("examen2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		examen.getChildren().addAll(examen1,examen2);
		
		TreeItem<PDFFile> tdtp1 =new TreeItem<PDFFile>(new PDFFile("tdtp1", "2020","/Users/abdoulayembaye/eclipse-workspace/ProjetGestionDoc/src/Ressources/Documents/Sem1L1/Chapitre 1.pdf"));
		TreeItem<PDFFile> tdtp2 =new TreeItem<PDFFile>(new PDFFile("ttp2", "2020","/Ressources/Documents/Sem1L1/chapitre2.pdf"));
		td_tp.getChildren().addAll(tdtp1,tdtp2);
		
		doc.getChildren().addAll(cours,examen,td_tp);
		table3S6L3.setRoot(doc);
		
		
	    table3S6L3.setOnMouseClicked(ex -> {
	        if (ex.getClickCount() == 2) {
	            PDFFile selectedFile = table3S6L3.getSelectionModel().getSelectedItem().getValue();
	            openPDFFile(selectedFile.getChemin());
	        }
	    });

    }

    
    //------------------------------------------Fin_Licence-----------------------------------------------------------------
    
   
    //switching semestre
    
	//SEMESTRE1L1
    @FXML
    void handlefirstSl(ActionEvent event) {
    	titre.setVisible(false);
    	tableL1.setVisible(false);
    	table1S2L1.setVisible(false);
    	table2S3L2.setVisible(false);
    	table2S4L2.setVisible(false);
    	table3S5L3.setVisible(false);
    	table3S6L3.setVisible(false);

    	centerPane2.setVisible(false);
    	centerPane3.setVisible(false);
    	centerPane4.setVisible(false);
    	centerPane5.setVisible(false);
    	centerPane6.setVisible(false);
    	centerPane1.setVisible(true);
    	centerPane1.setTranslateY(-150);
    	TranslateTransition transition=new TranslateTransition(Duration.seconds(0.6),centerPane1);
		transition.setToY(1);
		transition.play();
		
		

}
    
  //SEMESTRE2L1
    @FXML
    void handleSecondSl(ActionEvent event) {
    	titre.setVisible(false);
    	tableL1.setVisible(false);
    	table1S2L1.setVisible(false);
    	table2S3L2.setVisible(false);
    	table2S4L2.setVisible(false);
    	table3S5L3.setVisible(false);
    	table3S6L3.setVisible(false);
    	
    	centerPane1.setVisible(false);
    	centerPane3.setVisible(false);
    	centerPane4.setVisible(false);
    	centerPane5.setVisible(false);
    	centerPane6.setVisible(false);
    	centerPane2.setVisible(true);
    	centerPane2.setTranslateY(150);
    	TranslateTransition transition=new TranslateTransition(Duration.seconds(0.6),centerPane2);
		transition.setToY(1);
		transition.play();

    }
    
  //SEMESTRE3L2
    @FXML
    void handleThirdSl(ActionEvent event) {
    	titre.setVisible(false);
    	tableL1.setVisible(false);
    	table1S2L1.setVisible(false);
    	table2S3L2.setVisible(false);
    	table2S4L2.setVisible(false);
    	table3S5L3.setVisible(false);
    	table3S6L3.setVisible(false);
    	
    	centerPane1.setVisible(false);
    	centerPane2.setVisible(false);
    	centerPane4.setVisible(false);
    	centerPane5.setVisible(false);
    	centerPane6.setVisible(false);
    	centerPane3.setVisible(true);
    	centerPane3.setTranslateX(-230);
    	TranslateTransition transition=new TranslateTransition(Duration.seconds(0.6),centerPane3);
		transition.setToX(1);
		transition.play();


    }
    
  //SEMESTRE4L2
    @FXML
    void handleFourSl(ActionEvent event) {
    	titre.setVisible(false);
    	tableL1.setVisible(false);
    	table1S2L1.setVisible(false);
    	table2S3L2.setVisible(false);
    	table2S4L2.setVisible(false);
    	table3S5L3.setVisible(false);
    	table3S6L3.setVisible(false);
    	
    	centerPane1.setVisible(false);
    	centerPane2.setVisible(false);
    	centerPane3.setVisible(false);
    	centerPane5.setVisible(false);
    	centerPane6.setVisible(false);
    	centerPane4.setVisible(true);
    	centerPane4.setTranslateX(230);
    	TranslateTransition transition=new TranslateTransition(Duration.seconds(0.6),centerPane4);
		transition.setToX(1);
		transition.play();

    }
    
  //SEMESTRE5L3
    @FXML
    void handleFiveSl(ActionEvent event) {
    	titre.setVisible(false);
    	tableL1.setVisible(false);
    	table1S2L1.setVisible(false);
    	table2S3L2.setVisible(false);
    	table2S4L2.setVisible(false);
    	table3S5L3.setVisible(false);
    	table3S6L3.setVisible(false);
    	
    	centerPane1.setVisible(false);
    	centerPane2.setVisible(false);
    	centerPane3.setVisible(false);
    	centerPane4.setVisible(false);
    	centerPane6.setVisible(false);
    	centerPane5.setVisible(true);
    	centerPane5.setTranslateY(-150);
    	TranslateTransition transition=new TranslateTransition(Duration.seconds(0.6),centerPane5);
		transition.setToY(1);
		transition.play();


    }
    
  //SEMESTRE6L3
    @FXML
    void handleSixSl(ActionEvent event) {
    	titre.setVisible(false);
    	tableL1.setVisible(false);
    	table1S2L1.setVisible(false);
    	table2S3L2.setVisible(false);
    	table2S4L2.setVisible(false);
    	table3S5L3.setVisible(false);
    	table3S6L3.setVisible(false);
    	
    	
    	centerPane1.setVisible(false);
    	centerPane2.setVisible(false);
    	centerPane3.setVisible(false);
    	centerPane4.setVisible(false);
    	centerPane5.setVisible(false);
    	centerPane6.setVisible(true);
    	centerPane6.setTranslateX(-230);
    	TranslateTransition transition=new TranslateTransition(Duration.seconds(0.6),centerPane6);
		transition.setToX(1);
		transition.play();

    }
    

	@SuppressWarnings("unused")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		leftPane.setTranslateX(-210);
		
		bars.setOnMouseClicked(event->{
			TranslateTransition transition=new TranslateTransition(Duration.seconds(0.5),leftPane);
			
			TranslateTransition transition2=new TranslateTransition(Duration.seconds(0.5),centerPane1);
			TranslateTransition transition3=new TranslateTransition(Duration.seconds(0.5),centerPane2);
			TranslateTransition transition4=new TranslateTransition(Duration.seconds(0.5),centerPane3);
			TranslateTransition transition5=new TranslateTransition(Duration.seconds(0.5),centerPane4);
			TranslateTransition transition6=new TranslateTransition(Duration.seconds(0.5),centerPane5);
			TranslateTransition transition7=new TranslateTransition(Duration.seconds(0.5),centerPane6);
			
			transition.setToX(0);
			transition2.setToX(0);
			transition3.setToX(0);
			transition4.setToX(0);
			transition5.setToX(0);
			transition6.setToX(0);
			transition7.setToX(0);
			
			transition.play();
			transition2.play();
			transition3.play();
			transition4.play();
			transition5.play();
			transition6.play();
			transition7.play();
			
			RotateTransition ratation=new RotateTransition(Duration.seconds(0.5),bars);
			ratation.setByAngle(180);
			ratation.play();

			
			transition.setOnFinished(e->{
				bars.setVisible(false);
				close.setVisible(true);
			});
		});
	 	
		
		close.setOnMouseClicked(event->{
			TranslateTransition transition=new TranslateTransition(Duration.seconds(0.5),leftPane);
			TranslateTransition transition2=new TranslateTransition(Duration.seconds(0.5),centerPane1);
			TranslateTransition transition3=new TranslateTransition(Duration.seconds(0.5),centerPane2);
			TranslateTransition transition4=new TranslateTransition(Duration.seconds(0.5),centerPane3);
			TranslateTransition transition5=new TranslateTransition(Duration.seconds(0.5),centerPane4);
			TranslateTransition transition6=new TranslateTransition(Duration.seconds(0.5),centerPane5);
			TranslateTransition transition7=new TranslateTransition(Duration.seconds(0.5),centerPane6);
			
			transition.setToX(-210);
			transition2.setToX(-150);
			transition3.setToX(-150);
			transition4.setToX(-150);
			transition5.setToX(-150);
			transition6.setToX(-150);
			transition7.setToX(-150);
			
			transition.play();
			transition2.play();
			transition3.play();
			transition4.play();
			transition5.play();
			transition6.play();
			transition7.play();
			
			RotateTransition ratation=new RotateTransition(Duration.seconds(0.5),close);
			ratation.setByAngle(-180);
			ratation.play();
			
			transition.setOnFinished(e->{
				bars.setVisible(true);
				close.setVisible(false);
				
			});
		});
		
	}

}