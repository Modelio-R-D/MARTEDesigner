/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << Resource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d81b6091-c8ca-4c43-a707-b506dee546d0")
public class ResourceLifeline {
    @objid ("ab950e11-0627-42e2-99f7-16f82d827102")
    public static final String STEREOTYPE_NAME = "Resource_Lifeline";

    @objid ("2e5e6d34-cfd9-438f-85f3-090c25734ad5")
    public static final String RESOURCE_LIFELINE_ISACTIVE_TAGTYPE = "Resource_Lifeline_isActive";

    @objid ("d5a96ff4-af07-4385-9972-c7d580418ee6")
    public static final String RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE = "Resource_Lifeline_isProtected";

    @objid ("262e7923-0b3f-4f6a-95f5-faf7f915671e")
    public static final String RESOURCE_LIFELINE_RESMULT_TAGTYPE = "Resource_Lifeline_resMult";

    /**
     * The underlying {@link Lifeline} represented by this proxy, never null.
     */
    @objid ("a4dbedfa-475f-4316-aedd-24223f2235bf")
    protected final Lifeline elt;

    /**
     * Tells whether a {@link ResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << Resource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("96df7d3e-f0af-45a1-a284-9b7f77fd2a45")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << Resource_Lifeline >> then instantiate a {@link ResourceLifeline} proxy.
     * 
     * @return a {@link ResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("b222321a-e3c2-49ad-9ee2-0ecdf2a7ee43")
    public static ResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLifeline.STEREOTYPE_NAME);
        return ResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link ResourceLifeline} proxy from a {@link Lifeline} stereotyped << Resource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link ResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("6b97bc41-a925-467c-8b02-dc88c1b76a14")
    public static ResourceLifeline instantiate(final Lifeline obj) {
        return ResourceLifeline.canInstantiate(obj) ? new ResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceLifeline} proxy from a {@link Lifeline} stereotyped << Resource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link ResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("39bf1080-eaad-4d8e-bc5b-72bedb7d7366")
    public static ResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (ResourceLifeline.canInstantiate(obj))
        	return new ResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("ResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0749ef34-93a9-4db7-a8bf-67ddfd1efe25")
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
        ResourceLifeline other = (ResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("f60f9dda-f657-4ae7-8004-7b9f1a0d22c3")
    public Lifeline getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Lifeline_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5165f79-ad58-4ff9-a3ef-de6efc35d460")
    public String getResource_Lifeline_resMult() {
        return this.elt.getTagValue(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_RESMULT_TAGTYPE_ELT);
    }

    @objid ("8d830965-4b26-4d8a-8f91-43d8871a563b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Lifeline_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c58e0033-7d91-46f5-87ef-c04b69a27681")
    public boolean isResource_Lifeline_isActive() {
        return this.elt.isTagged(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Lifeline_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1c2d7d0-09d4-4cec-a36d-e803fd2bf5bb")
    public boolean isResource_Lifeline_isProtected() {
        return this.elt.isTagged(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Lifeline_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("39e12c72-e930-49fe-9f9b-689077f1baf2")
    public void setResource_Lifeline_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Lifeline_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("679c9810-ef8e-4215-94a8-27e4ee2e81a9")
    public void setResource_Lifeline_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_Lifeline_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b707b064-2dae-43f5-924a-70c30a41b2d6")
    public void setResource_Lifeline_resMult(final String value) {
        this.elt.putTagValue(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("8806ad21-30d5-4942-a66e-83328a5f4fc9")
    protected ResourceLifeline(final Lifeline elt) {
        this.elt = elt;
    }

    @objid ("a99ac833-899b-4303-93b0-c3872cd182bd")
    public static final class MdaTypes {
        @objid ("8de1077f-6fed-432a-85b2-f2d4fc737035")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c58b8b54-dc2c-4e0f-9e3f-95590246e0e6")
        public static TagType RESOURCE_LIFELINE_RESMULT_TAGTYPE_ELT;

        @objid ("e6c29762-90d8-46ef-8edf-979dec1cefb5")
        public static TagType RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT;

        @objid ("2ce28ebe-7c62-40c8-b5f2-e9c90e63e4e9")
        public static TagType RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT;

        @objid ("6333a00c-98da-43ee-8319-2048308daa94")
        private static Stereotype MDAASSOCDEP;

        @objid ("460f3950-3cca-47ca-be90-a773ee6ede20")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f526ff3d-e702-4f47-ba52-2e202e8f0f1d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "76f4d21a-101a-11df-86fe-0014222a9f79");
            RESOURCE_LIFELINE_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8a51a35d-101a-11df-86fe-0014222a9f79");
            RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8a51a35e-101a-11df-86fe-0014222a9f79");
            RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8a51a35f-101a-11df-86fe-0014222a9f79");
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
