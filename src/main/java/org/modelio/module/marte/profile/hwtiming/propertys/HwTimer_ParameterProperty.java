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

@objid ("2760f7c9-e1b6-4af4-911f-3d90de8dd8c8")
public class HwTimer_ParameterProperty implements IPropertyContent {
    @objid ("25f17c17-37c1-4c65-86ba-bc3544405adb")
    private static List<ModelElement> listHwClock = null;

    @objid ("80537a3d-635b-44ae-abeb-ccb5e4d25276")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMER_PARAMETER_HWTIMER_PARAMETER_COUNTERWIDTH, value);
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                    listHwClock, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_INPUTCLOCK_HWTIMER_HWCLOCK, 
        //                    MARTEDesignerTagTypes.HWTIMER_PARAMETER_HWTIMER_PARAMETER_INPUTCLOCK, 
                    value
            );
        
        }
        else if (row == 3) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMER_PARAMETER_HWTIMER_PARAMETER_NBCOUNTERS, value);
        }
    }

    @objid ("e5d851d2-8a92-4eb2-94a9-e2b3c96ea156")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Timer
        //
        String value_nbCounters = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_PARAMETER_HWTIMER_PARAMETER_NBCOUNTERS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_PARAMETER_HWTIMER_PARAMETER_NBCOUNTERS),value_nbCounters);
        
        listHwClock = MARTESearchUtils.searchHwClock();
        String[] tab_inputClock = ModelUtils.createListString(listHwClock);      
        String value_inputClock = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INPUTCLOCK_HWTIMER_HWCLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_PARAMETER_HWTIMER_PARAMETER_INPUTCLOCK), value_inputClock, tab_inputClock);
        
        
        String value_counterWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_PARAMETER_HWTIMER_PARAMETER_COUNTERWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_PARAMETER_HWTIMER_PARAMETER_COUNTERWIDTH),value_counterWidth);
    }

}
