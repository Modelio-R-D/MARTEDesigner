package org.modelio.module.marte.profile.gcm.model;

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

@objid ("17015725-fab8-4cd4-a01e-0cb185e66248")
public class DataPool_BindableInstance {
    @objid ("4c1c82b7-02e8-43b5-8688-b88f0a06b778")
    protected BindableInstance element;

    @objid ("554e5677-5196-41af-9f22-26f3e990c921")
    public DataPool_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DATAPOOL_BINDABLEINSTANCE);
        this.element.setName(MARTEResourceManager.getName("DataPool_BindableInstance"));
    }

    @objid ("568a58bb-ca6f-41e1-8822-42f6f5ad8ea5")
    public DataPool_BindableInstance(BindableInstance element) {
        this.element = element;
    }

    @objid ("bca14eba-c355-4280-865d-d7974e36fdfa")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("97354795-cdfe-490b-b113-2fe4849aaf27")
    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("4d571e1f-fee4-41f5-817f-d7b87e7c9d3d")
    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("cfab364a-ba53-41e2-9400-09aaf7597db8")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("03a7f617-aecc-450d-88ba-0b01fb19b8ee")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("45afa748-1a78-4ecc-84e0-d5de274a0a2e")
    public String getordering() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_ORDERING, this.element);
    }

    @objid ("c7126752-7148-4c64-b484-c2c9ebbb003d")
    public void setordering(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_ORDERING, value);
    }

    @objid ("e10618e4-a865-4f78-b26e-1ae2a1e4ddd5")
    public String getinsertion() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_INSERTION, this.element);
    }

    @objid ("c9f5a52a-b1e5-423b-aae9-73401bcfab01")
    public void setinsertion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_INSERTION, value);
    }

    @objid ("06eae575-3c86-4095-8e27-bd6c33803462")
    public String getselection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_SELECTION, this.element);
    }

    @objid ("7c1b1bc4-66bf-4bf6-83ff-3eae24144951")
    public void setselection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_BINDABLEINSTANCE_DATAPOOL_BINDABLEINSTANCE_SELECTION, value);
    }

}
