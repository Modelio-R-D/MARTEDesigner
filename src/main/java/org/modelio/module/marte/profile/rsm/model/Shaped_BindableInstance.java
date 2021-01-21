package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2448474b-6c9d-4e69-96b2-f7b319dd5b1f")
public class Shaped_BindableInstance {
    @objid ("a100da7b-b788-4bf3-8665-6077ba7843e1")
    protected BindableInstance element;

    @objid ("b7e37709-210d-4526-bc4e-22bd13d2e759")
    public Shaped_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,"Shaped_BindableInstance");
        this.element.setName(MARTEResourceManager.getName("Shaped_BindableInstance"));
    }

    @objid ("16c79202-38e6-4922-8fa7-6dc1605159e7")
    public Shaped_BindableInstance(BindableInstance element) {
        this.element = element;
    }

    @objid ("d1e2ddeb-48f7-4847-a42e-8ee36c17b35c")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("9a40b72d-a9b4-4ab5-b5cb-a26ab5c651cb")
    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("ce5fee99-1bbc-4ec3-a58a-d64e7f5b5d0d")
    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("374a50c1-ea4d-4400-a14c-985a52d8d3d6")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("691a0989-44a0-4ba6-b9bd-d8d2467e7bba")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("161efc84-9120-4c31-a349-65f3df39e52c")
    public String getshape() {
        return ModelUtils.getTaggedValue("Shaped_BindableInstance_shape", this.element);
    }

    @objid ("20afe144-97bf-4bc0-8660-b51636edc1a0")
    public void setshape(String value) {
        ModelUtils.addStringValue(this.element,"Shaped_BindableInstance_shape", value);
    }

}
