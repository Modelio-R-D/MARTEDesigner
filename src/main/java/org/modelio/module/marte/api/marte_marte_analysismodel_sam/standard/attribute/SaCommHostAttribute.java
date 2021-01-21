/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.attribute;

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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute.GaCommHostAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SaCommHost_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0c310d37-c645-4faa-a402-61c05f0dbca9")
public class SaCommHostAttribute extends GaCommHostAttribute {
    @objid ("c3dffb89-df5a-44ef-ad3f-f842c5e8436e")
    public static final String STEREOTYPE_NAME = "SaCommHost_Attribute";

    @objid ("b9bb9d24-8f6d-4c4c-b51a-f4c5501f8cf0")
    public static final String SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE = "SaCommHost_Attribute_isSched";

    @objid ("b7c51a36-f3b2-4ec6-90f1-42697afebc57")
    public static final String SACOMMHOST_ATTRIBUTE_SCHSLACK_TAGTYPE = "SaCommHost_Attribute_schSlack";

    /**
     * Tells whether a {@link SaCommHostAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SaCommHost_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2496c910-5328-4423-a3c3-8529b37f61dd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SaCommHost_Attribute >> then instantiate a {@link SaCommHostAttribute} proxy.
     * 
     * @return a {@link SaCommHostAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("c741f763-a3be-4950-8626-437a1fda17ad")
    public static SaCommHostAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAttribute.STEREOTYPE_NAME);
        return SaCommHostAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostAttribute} proxy from a {@link Attribute} stereotyped << SaCommHost_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SaCommHostAttribute} proxy or <i>null</i>.
     */
    @objid ("51ea58dc-b2ef-4846-82f4-ce12a4268875")
    public static SaCommHostAttribute instantiate(final Attribute obj) {
        return SaCommHostAttribute.canInstantiate(obj) ? new SaCommHostAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostAttribute} proxy from a {@link Attribute} stereotyped << SaCommHost_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SaCommHostAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2bd54230-8966-48da-9c2e-f25575861810")
    public static SaCommHostAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SaCommHostAttribute.canInstantiate(obj))
        	return new SaCommHostAttribute(obj);
        else
        	throw new IllegalArgumentException("SaCommHostAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("24a84a23-0e3e-4672-a4a9-479299b6fd3c")
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
        SaCommHostAttribute other = (SaCommHostAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("13251762-a9f1-454a-93fa-f1968ec3cc6f")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'SaCommHost_Attribute_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab4ada70-c505-4ced-bbcf-8818721fa88b")
    public String getSaCommHost_Attribute_schSlack() {
        return this.elt.getTagValue(SaCommHostAttribute.MdaTypes.SACOMMHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT);
    }

    @objid ("4dea4cb5-5ce2-494f-aed5-53ebc9f7cd05")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Attribute_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e7535d6-03fe-4e59-aeb1-622a3a81af5c")
    public boolean isSaCommHost_Attribute_isSched() {
        return this.elt.isTagged(SaCommHostAttribute.MdaTypes.SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Attribute_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8577e971-40b2-4b48-b8c0-e9e9c23707dc")
    public void setSaCommHost_Attribute_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostAttribute.MdaTypes.SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostAttribute.MdaTypes.SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_Attribute_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23be5f44-dc4c-4c3b-b6bf-a071bff8f9b0")
    public void setSaCommHost_Attribute_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostAttribute.MdaTypes.SACOMMHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT, value);
    }

    @objid ("b8ef558d-fb56-4177-b654-81fa8844cfd3")
    protected SaCommHostAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("b7646b41-1ba1-4321-abc5-9ae844a6b322")
    public static final class MdaTypes {
        @objid ("e18ab9b4-889d-4561-b999-02d721261e4f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8c4528e8-197c-498e-ac4f-06d3cb47030e")
        public static TagType SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT;

        @objid ("c8209081-8baa-4278-8b5d-86086c462fb8")
        public static TagType SACOMMHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT;

        @objid ("976c3669-52d9-4dd2-9870-5c8139aa0c20")
        private static Stereotype MDAASSOCDEP;

        @objid ("28cb6a35-fc32-452c-9667-7cf28eb79848")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b9706951-51c2-45e4-b4bf-3419066333ee")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "039c9247-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_ATTRIBUTE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c924e-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_ATTRIBUTE_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9255-0ccf-11df-8525-001302895b2b");
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
