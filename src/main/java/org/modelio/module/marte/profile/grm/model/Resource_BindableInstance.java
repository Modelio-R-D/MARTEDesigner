package org.modelio.module.marte.profile.grm.model;

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

@objid ("c6f9202c-34e3-4165-80b1-35688955efa2")
public class Resource_BindableInstance {
    @objid ("e86f031f-a208-45da-a7f0-5c5efd87e6cc")
    protected BindableInstance element;

    @objid ("d6344f03-995c-4d33-99b2-683973997048")
    public Resource_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("Resource_BindableInstance"));
    }

    @objid ("d6ff35da-94f7-48c0-837c-0127131f405e")
    public Resource_BindableInstance(final BindableInstance element) {
        this.element = element;
    }

    @objid ("d946e2d5-f84b-4836-acbe-6c534633dc36")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("4c294963-368b-4ef6-8c24-eb859d57489a")
    public void setParent(final Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("5909f98c-ebb0-4970-9ae0-63fba4a59c52")
    public void setParent(final Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("07e216f1-7620-457b-bbb0-30e3e1a921e4")
    public void setParent(final NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("4873dd9f-9ff1-41de-b953-0b04a65ec6e9")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("2625dde9-6a61-468d-9128-55dddcf3f903")
    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_RESMULT, this.element);
    }

    @objid ("52f9b349-1a20-4907-9efd-4b0479073a16")
    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_RESMULT, value);
    }

    @objid ("955c4fb2-e98e-4c2b-bf64-73e140ec3348")
    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_ISPROTECTED, this.element);
    }

    @objid ("f5ef1938-c4c1-44d3-a054-55a58399be7f")
    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_ISPROTECTED,value);
    }

    @objid ("bef2670e-ab2b-40f9-a206-010d23c38cba")
    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_ISACTIVE, this.element);
    }

    @objid ("65d24bba-ded6-40ed-ab6b-d7ea74aa097e")
    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_INSTANCE_RESOURCE_INSTANCE_ISACTIVE,value);
    }

}
