/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << PaLogicalResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b53cd6b4-0a4a-4403-a11e-11384a4822b0")
public class PaLogicalResourceInstance {
    @objid ("d155e01f-d478-47cb-9357-739c9f2a9f7d")
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Instance";

    @objid ("bf99d774-83b6-4229-9a57-c990384b6c67")
    public static final String PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE = "PaLogicalResource_Instance_poolSize";

    @objid ("9b60cb31-e0e0-4ab2-9b10-14e56c5ea290")
    public static final String PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE = "PaLogicalResource_Instance_throughput";

    @objid ("1fca0960-0c47-4e4f-b11b-8e807bf4b461")
    public static final String PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE = "PaLogicalResource_Instance_utilization";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    @objid ("411453ce-35ae-45da-917e-b25d04f8e467")
    protected final Instance elt;

    /**
     * Tells whether a {@link PaLogicalResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << PaLogicalResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("441b35cc-8607-4b33-9e18-1be7733217ae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << PaLogicalResource_Instance >> then instantiate a {@link PaLogicalResourceInstance} proxy.
     * 
     * @return a {@link PaLogicalResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("fa564dd6-cd86-4c72-80f3-61ac126e6bf6")
    public static PaLogicalResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceInstance.STEREOTYPE_NAME);
        return PaLogicalResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceInstance} proxy from a {@link Instance} stereotyped << PaLogicalResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link PaLogicalResourceInstance} proxy or <i>null</i>.
     */
    @objid ("43e5508b-dd3e-4b07-bf84-52ea059c18cc")
    public static PaLogicalResourceInstance instantiate(final Instance obj) {
        return PaLogicalResourceInstance.canInstantiate(obj) ? new PaLogicalResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceInstance} proxy from a {@link Instance} stereotyped << PaLogicalResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link PaLogicalResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("678de581-69fd-4cd9-93d0-be754fa43795")
    public static PaLogicalResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (PaLogicalResourceInstance.canInstantiate(obj))
        	return new PaLogicalResourceInstance(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d2d61c6-e77f-4ff0-a350-4416ebb13a48")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PaLogicalResourceInstance other = (PaLogicalResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("0e7ee9ef-454e-4316-8757-2061be707079")
    public Instance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PaLogicalResource_Instance_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("64ac8781-a2c7-4325-8ad2-3ea1581c6c9b")
    public String getPaLogicalResource_Instance_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf9177e0-fe3e-48aa-b62b-0b196299166c")
    public String getPaLogicalResource_Instance_throughput() {
        return this.elt.getTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1fd8cca4-09ec-44f1-a542-3113edf32b52")
    public String getPaLogicalResource_Instance_utilization() {
        return this.elt.getTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("752cf0b1-cf6e-4efe-8a32-aaa8f1d9d57d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Instance_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2f43d0e-5d86-4fdb-8beb-7721cac7bc76")
    public void setPaLogicalResource_Instance_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Instance_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5257e733-8c9e-4d18-87ba-1630a687aa0a")
    public void setPaLogicalResource_Instance_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("99626d2e-3579-405b-a9d9-50d6266eb864")
    public void setPaLogicalResource_Instance_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceInstance.MdaTypes.PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE_ELT, value);
    }

    @objid ("0fdcc88e-13ed-422e-ae0f-a21923b92c84")
    protected PaLogicalResourceInstance(final Instance elt) {
        this.elt = elt;
    }

    @objid ("0ff2d012-001a-4ac0-8aac-e8ae5a6385ec")
    public static final class MdaTypes {
        @objid ("81627635-543b-4330-a116-0b204653795b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b1d3277f-707e-45d1-abda-094c951b03a7")
        public static TagType PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE_ELT;

        @objid ("d80a4c5c-1e0a-49e5-a604-f1784cd90afd")
        public static TagType PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("56f8e692-fce5-4b75-a706-391877f30368")
        public static TagType PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE_ELT;

        @objid ("7cd9b3c2-9454-4701-ab64-d0a9ebcd04c4")
        private static Stereotype MDAASSOCDEP;

        @objid ("df09771d-a789-45b9-ad25-f8bdce0023f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("acf2a884-2921-44e2-83ff-afc0e495e52e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d10557-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_INSTANCE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d1055e-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_INSTANCE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367a4-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_INSTANCE_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367ab-0ccf-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
