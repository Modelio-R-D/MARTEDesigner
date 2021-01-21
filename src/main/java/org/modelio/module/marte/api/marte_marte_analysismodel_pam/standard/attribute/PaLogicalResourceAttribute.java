/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << PaLogicalResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9baa3e2a-eb7e-4fcf-9894-a760cc1d1ffc")
public class PaLogicalResourceAttribute extends ResourceAttribute {
    @objid ("9d959369-02d8-4834-8a64-4b8b952f92a8")
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Attribute";

    @objid ("de84c167-7432-4c72-b132-f7d8812f4364")
    public static final String PALOGICALRESOURCE_ATTRIBUTE_POOLSIZE_TAGTYPE = "PaLogicalResource_Attribute_poolSize";

    @objid ("f9f18bd8-b5d7-4a21-8eac-320eff6d98b9")
    public static final String PALOGICALRESOURCE_ATTRIBUTE_THROUGHPUT_TAGTYPE = "PaLogicalResource_Attribute_throughput";

    @objid ("52cad6ea-097b-4fd7-a817-39e0593bc4a8")
    public static final String PALOGICALRESOURCE_ATTRIBUTE_UTILIZATION_TAGTYPE = "PaLogicalResource_Attribute_utilization";

    /**
     * Tells whether a {@link PaLogicalResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << PaLogicalResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e7e128b2-211e-44c6-91a5-be2c38847d89")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << PaLogicalResource_Attribute >> then instantiate a {@link PaLogicalResourceAttribute} proxy.
     * 
     * @return a {@link PaLogicalResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("514ce450-29e0-4fc7-afd8-9a17a0aaf406")
    public static PaLogicalResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceAttribute.STEREOTYPE_NAME);
        return PaLogicalResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceAttribute} proxy from a {@link Attribute} stereotyped << PaLogicalResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link PaLogicalResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("64e4371e-686d-4c29-b6bd-535a554ced98")
    public static PaLogicalResourceAttribute instantiate(final Attribute obj) {
        return PaLogicalResourceAttribute.canInstantiate(obj) ? new PaLogicalResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceAttribute} proxy from a {@link Attribute} stereotyped << PaLogicalResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link PaLogicalResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("00c4e026-eb7a-4c74-acb2-fbe41bdca280")
    public static PaLogicalResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (PaLogicalResourceAttribute.canInstantiate(obj))
        	return new PaLogicalResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ba61672b-8abe-452c-adc2-57417df0d5ef")
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
        PaLogicalResourceAttribute other = (PaLogicalResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("1bac5742-fbf7-441f-9e67-ad35fa140bbf")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'PaLogicalResource_Attribute_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a44c909-9c7e-460a-a6c7-875c4b143afa")
    public String getPaLogicalResource_Attribute_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceAttribute.MdaTypes.PALOGICALRESOURCE_ATTRIBUTE_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Attribute_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("672aabaa-ae5f-4804-bc4b-58b991f5dc66")
    public String getPaLogicalResource_Attribute_throughput() {
        return this.elt.getTagValue(PaLogicalResourceAttribute.MdaTypes.PALOGICALRESOURCE_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Attribute_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5254f3be-c436-4813-8928-a01b4e218344")
    public String getPaLogicalResource_Attribute_utilization() {
        return this.elt.getTagValue(PaLogicalResourceAttribute.MdaTypes.PALOGICALRESOURCE_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("34d807d9-636f-465b-ad02-6063a127d940")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Attribute_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3acddc7d-365c-4029-a443-7d26ccb7efe0")
    public void setPaLogicalResource_Attribute_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceAttribute.MdaTypes.PALOGICALRESOURCE_ATTRIBUTE_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Attribute_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14ed5aca-044d-4229-87e1-151158b8883c")
    public void setPaLogicalResource_Attribute_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceAttribute.MdaTypes.PALOGICALRESOURCE_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Attribute_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("92388f89-49a1-4cfd-b900-8c1f08b39cdb")
    public void setPaLogicalResource_Attribute_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceAttribute.MdaTypes.PALOGICALRESOURCE_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT, value);
    }

    @objid ("e2ddcc2d-1603-4aea-a57e-50fcf31d873b")
    protected PaLogicalResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("4a28d395-4017-46da-b5fe-78535a85c4f5")
    public static final class MdaTypes {
        @objid ("a31c52bb-d632-4641-9957-632c3860b1bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d6671c77-178d-4b44-9949-2159aa937a9f")
        public static TagType PALOGICALRESOURCE_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT;

        @objid ("b8f4b9fa-d963-43e6-b49e-7d5cd19db76a")
        public static TagType PALOGICALRESOURCE_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT;

        @objid ("6cfd1bf3-e39d-4266-b052-41cc4cb9b87f")
        public static TagType PALOGICALRESOURCE_ATTRIBUTE_POOLSIZE_TAGTYPE_ELT;

        @objid ("4fb32272-5b14-48d3-aaab-161ab9f91e1e")
        private static Stereotype MDAASSOCDEP;

        @objid ("be64de2d-3485-4265-a0e3-8c11052facb2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2c4239d9-9b97-4484-a0e4-cf32e49692f8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d10554-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d1055b-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_ATTRIBUTE_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d10562-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_ATTRIBUTE_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367a8-0ccf-11df-8525-001302895b2b");
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
