package org.modelio.module.marte.profile.hwtiming.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b07419c6-7fa4-458d-9e41-d2caf02c9841")
public class HwTimer_AssociationProperty implements IPropertyContent {
    @objid ("a518576c-3cbc-4c3d-9560-14ed610dda36")
    private static List<ModelElement> listHwClock = null;

    @objid ("cb146c62-43ca-40e0-8718-0ae293ed48de")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMER_ASSOCIATION_HWTIMER_ASSOCIATION_COUNTERWIDTH, value);
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                    listHwClock, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_INPUTCLOCK_HWTIMER_HWCLOCK, 
        //                    MARTEDesignerTagTypes.HWTIMER_ASSOCIATION_HWTIMER_ASSOCIATION_INPUTCLOCK, 
                    value
            );
        
        }
        else if (row == 3) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMER_ASSOCIATION_HWTIMER_ASSOCIATION_NBCOUNTERS, value);
        }
    }

    @objid ("bb77ead3-36fe-4bbc-b574-44310338cf89")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Timer
        //
        String value_nbCounters = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_ASSOCIATION_HWTIMER_ASSOCIATION_NBCOUNTERS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_ASSOCIATION_HWTIMER_ASSOCIATION_NBCOUNTERS),value_nbCounters);
        
        listHwClock = MARTESearchUtils.searchHwClock();
        String[] tab_inputClock = ModelUtils.createListString(listHwClock);      
        String value_inputClock = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INPUTCLOCK_HWTIMER_HWCLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_ASSOCIATION_HWTIMER_ASSOCIATION_INPUTCLOCK), value_inputClock, tab_inputClock);
        
        
        String value_counterWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_ASSOCIATION_HWTIMER_ASSOCIATION_COUNTERWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_ASSOCIATION_HWTIMER_ASSOCIATION_COUNTERWIDTH),value_counterWidth);
    }

}
