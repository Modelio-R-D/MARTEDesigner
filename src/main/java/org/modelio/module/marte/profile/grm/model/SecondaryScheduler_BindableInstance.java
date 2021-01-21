package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6fec108c-d97c-432d-8e34-94875492ab45")
public class SecondaryScheduler_BindableInstance extends Scheduler_BindableInstance {
    @objid ("8cde159c-4e8f-4e41-aece-1b58f7ae74eb")
    public SecondaryScheduler_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("SecondaryScheduler_BindableInstance"));
        this.isisPreemptible(true);
    }

    @objid ("d534af19-ea58-4b2a-9ad4-c80c76da05a7")
    public SecondaryScheduler_BindableInstance(final BindableInstance element) {
        super(element);
    }

    @objid ("53a048d5-358a-4243-ba22-cbeb897aec05")
    public String gvirtualprocessingunits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_INSTANCE_SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS, this.element);
    }

    @objid ("cee0c237-d3ed-4648-a84f-9ba71076b2ad")
    public void setvirtualprocessingunits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_INSTANCE_SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS, value);
    }

}
