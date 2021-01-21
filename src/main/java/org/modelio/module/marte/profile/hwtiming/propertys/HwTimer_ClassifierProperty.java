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

@objid ("4748d101-d821-4e07-ba22-0e1a54247e07")
public class HwTimer_ClassifierProperty implements IPropertyContent {
    @objid ("c3d196d2-87c8-4519-8eb4-0ff37b5a83c0")
    private static List<ModelElement> listHwClock = null;

    @objid ("d2f256f6-40e8-459a-833d-265cef655510")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_COUNTERWIDTH, value);
        }
        else if(row == 2){
            ModelUtils.manageSingleOrientedLink(elt, 
                    listHwClock, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_INPUTCLOCK_HWTIMER_HWCLOCK, 
        //                    MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_INPUTCLOCK, 
                    value
            );
        
        }
        else if (row == 3) {
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_NBCOUNTERS, value);
        }
    }

    @objid ("a4b60e62-4843-41da-b6ba-3b168ea1b02d")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Timer
        //
        String value_nbCounters = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_NBCOUNTERS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_NBCOUNTERS),value_nbCounters);
        
        listHwClock = MARTESearchUtils.searchHwClock();
        String[] tab_inputClock = ModelUtils.createListString(listHwClock);      
        String value_inputClock = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_INPUTCLOCK_HWTIMER_HWCLOCK, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_INPUTCLOCK), value_inputClock, tab_inputClock);
        
        
        String value_counterWidth = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_COUNTERWIDTH, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_COUNTERWIDTH),value_counterWidth);
    }

}
