package org.modelio.module.marte.profile.time.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("912dc985-675e-4bb6-9ddb-48aa49becbd4")
public class Clock_BindableInstance {
    @objid ("978b1082-a1dd-44f3-80a5-ad761d2e4efb")
    protected BindableInstance element;

    @objid ("1544964d-bf64-464f-bdc0-03dacf6c3790")
    public Clock_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCK_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("Clock_BindableInstance")+ModelUtils.getNbElement(BindableInstance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE));
    }

    @objid ("69e9589c-5f35-45fe-a473-e6246081c110")
    public Clock_BindableInstance(BindableInstance element) {
        this.element = element;
    }

    @objid ("1a19e59e-1a02-4cf2-97c5-ff993ccda89d")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("5ed3d884-0992-4771-a74a-a1cab187c3f3")
    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("280e5eec-8d89-40cf-96ae-b69c9318dbac")
    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("a7862aec-0632-4b5f-b545-5ba29fc59a2a")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("52e65145-8687-4f94-bf3e-4637f3f96f75")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("6630cf60-349f-40e7-b6e6-6a023071c626")
    public String getstandard() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_STANDARD, this.element);
    }

    @objid ("beffb6d6-fb4d-4feb-9f61-fe6c6db89c5a")
    public void setstandard(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_STANDARD, value);
    }

    @objid ("6440d8ed-6c06-4106-a132-317a3a830b17")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_TYPE, this.element);
    }

    @objid ("59674105-a06b-460c-be21-6e61c623f3b4")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_TYPE, value);
    }

    @objid ("5b5b720f-4dc7-4b99-98fc-870708a417ff")
    public String getunit() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_UNIT, this.element);
    }

    @objid ("23b21741-c300-4c71-aa18-b3818474ac91")
    public void setunit(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_UNIT, value);
    }

}
