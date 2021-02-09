package org.modelio.module.marte.profile.gqam.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaStep_ModelElementProperty implements IPropertyContent {
    private static List<ModelElement> _schedResources = null;

    private static List<ModelElement> _gascenario = null;

    private static List<ModelElement> _gaexechosts = null;

    private static List<ModelElement> _garequestedservices = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_ISATOMIC, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_BLOCKT, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_REP, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_PROB, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_PRIORITY, value);
        }
        else if(row == 6){
            ModelUtils.manageSingleOrientedLink(elt, 
                    _schedResources, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRES_GASTEP, 
        //                    MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_CONCURRES, 
                    value
            );
            
        }
        else if(row == 7){
            ModelUtils.manageSingleOrientedLink(elt, 
                    _gaexechosts, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_GASTEP, 
        //                    MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_HOST, 
                    value
            );
        }
        else if(row == 8){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    _garequestedservices, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SERVDEMAN_GASTEP, 
        //                    MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_SERVDEMAND, 
                    value
            );
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_SERVCOUNT, value);
        }
        else if(row == 10){
            ModelUtils.manageOneToOneLink(elt, 
                                                _gascenario, 
                                                MARTEDesignerStereotypes.PROFILEASSOCIATION_CHILDSCENARIO_GASCENARIO, 
                                                MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_CHILDSCENARIO,
                                                MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_PARENTSTEP, 
                                                value
                                        );
        }
        else if(row == 11){
            ModelUtils.manageMultipleToOneLink(elt, 
                                          _gascenario, 
                                          MARTEDesignerStereotypes.PROFILEASSOCIATION_SCENARIO_GASCENARIO, 
                                          MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_SCENARIO,
                                          MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_STEPS, 
                                          value
                                  );
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_ISATOMIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_ISATOMIC, elt));
        
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_BLOCKT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_BLOCKT),value);
        
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_REP, elt);
        if (value.equals(""))
            value = "1";
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_REP),value);
        
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_PROB, elt);
        if (value.equals(""))
            value = "1";
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_PROB),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_PRIORITY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_PRIORITY),value);
        
        _schedResources = MARTESearchUtils.searchSchedulableResource();   
        String[] tab_schedResources = ModelUtils.createListString(_schedResources);      
        String value_schedResource = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CONCURRES_GASTEP, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_CONCURRES), value_schedResource, tab_schedResources);
        
        _gaexechosts = MARTESearchUtils.searchGaExecHost();
        String[] tab_gaexechosts = ModelUtils.createListString(_gaexechosts);      
        String value_gaexechost = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_GASTEP, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_HOST), value_gaexechost, tab_gaexechosts);
        
        _garequestedservices = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GAREQUESTEDSERVICE_MODELELEMENT);
        String[] tab_garequestedservices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SERVDEMAN_GASTEP), _garequestedservices);
        String value_garequestedservice = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SERVDEMAN_GASTEP, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_SERVDEMAND), value_garequestedservice, tab_garequestedservices);
            
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_SERVCOUNT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_SERVCOUNT),value);
        
        _gascenario = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GASCENARIO_MODELELEMENT);   
        String[] tab_GaScenario = ModelUtils.createListString(_gascenario);      
               
        String value_childscenario = ModelUtils.getDependencyName(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CHILDSCENARIO_GASCENARIO);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_CHILDSCENARIO), value_childscenario, tab_GaScenario);
               
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_SCENARIO, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_SCENARIO),value);
    }

}
