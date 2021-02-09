package org.modelio.module.marte.profile.gqam.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaScenario_ModelElementProperty implements IPropertyContent {
    private static List<ModelElement> _causes = null;

    private static List<ModelElement> _roots = null;

    private static List<ModelElement> _steps = null;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageSingleOrientedLink(elt, 
                    _causes, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CAUSE_GASCENARIO, 
        //                    MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_CAUSE, 
                    value
            );
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_HOSTDEMAND, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_HOSTDEMANDOPS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_INTEROCCT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_THROUGHPUT, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_RESPT, value);
        }
        else if(row == 7){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_UTILIZATION, value);
        }
        else if(row == 8){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_UTILIZATIONONHOST, value);
        }
        else if(row == 9){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    _roots, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ROOT_GASCENARIO, 
        //                    MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_ROOT, 
                    value
            );
        }
        else if(row == 10){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_TIMING, value);
            
            
        }
        else if(row == 11){
            ModelUtils.manageOneToOneLink(elt, 
                                          _steps, 
                                                  MARTEDesignerStereotypes.PROFILEASSOCIATION_CHILDSCENARIO_GASCENARIO, 
                                                  MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_PARENTSTEP, 
                                                  MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_CHILDSCENARIO, 
                                                  value
                                          );
        }
        else if(row == 12){
            ModelUtils.manageOneToMultipleLink(elt, 
                                               _steps, 
                                                  MARTEDesignerStereotypes.PROFILEASSOCIATION_SCENARIO_GASCENARIO, 
                                                  MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_STEPS, 
                                                  MARTEDesignerTagTypes.GASTEP_MODELELEMENT_GASTEP_MODELELEMENT_SCENARIO, 
                                                  value
                                          );
        }
        else if(row == 13){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_EXECTIME, value);
        }
        else if(row == 14){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY, value);
        }
        else if(row == 15){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_USEDMEMORY, value);
        }
        else if(row == 16){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_POWERPEAK, value);
        }
        else if(row == 17){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_ENERGY, value);
        }
        else if(row == 18){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_SUBUSAGE, value);
        }
        else if(row == 19){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_USEDRESOURCES, value);
        }
        else if(row == 20){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_MSGSIZE, value);
        }
        else if(row == 21){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_DURATION, value);
        }
        else if(row == 22){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_START, value);
        }
        else if(row == 23){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_FINISH, value);
        }
        else if(row == 24){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_ON, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        _causes = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GAWORKLOADEVENT_MODELELEMENT);   
        String[] tab_causes = ModelUtils.createListString(_causes);      
        String value_causes = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CAUSE_GASCENARIO, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_CAUSE), value_causes, tab_causes);
            
        String value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_HOSTDEMAND, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_HOSTDEMAND),value);
        
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_HOSTDEMANDOPS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_HOSTDEMANDOPS),value);
        
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_INTEROCCT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_INTEROCCT),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_THROUGHPUT),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_RESPT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_RESPT),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_UTILIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_UTILIZATION),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_UTILIZATIONONHOST, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_UTILIZATIONONHOST),value);
        
        _roots = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GASTEP_MODELELEMENT);
        String[] tab_roots = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ROOT_GASCENARIO), _roots);
        String value_roots = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ROOT_GASCENARIO, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_ROOT), value_roots, tab_roots);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_TIMING, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_TIMING),value);
        
        
        _steps = ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.GASTEP_MODELELEMENT);   
        String[] tab_GaScenario = ModelUtils.createListString(_steps);      
               
        String value_childscenario = ModelUtils.getDependencyName(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CHILDSCENARIO_GASCENARIO);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_PARENTSTEP), value_childscenario, tab_GaScenario);
        
        String[] tab_steps = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SCENARIO_GASCENARIO), _steps);
        String value_scenario = ModelUtils.getDependencyName(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CHILDSCENARIO_GASCENARIO);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_STEPS), value_scenario, tab_steps);
               
        
               
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_EXECTIME, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_EXECTIME),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_ALLOCATEDMEMORY),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_USEDMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_USEDMEMORY),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_POWERPEAK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_POWERPEAK),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_ENERGY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_ENERGY),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_SUBUSAGE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_SUBUSAGE),value);
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_USEDRESOURCES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_USEDRESOURCES),value);
        
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_MSGSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_MSGSIZE),value);
        
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_DURATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_DURATION),value);
        
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_START, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_START),value);
        
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_FINISH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_FINISH),value);
        
        
        value = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_ON, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GASCENARIO_MODELELEMENT_GASCENARIO_MODELELEMENT_ON),value);
    }

}
