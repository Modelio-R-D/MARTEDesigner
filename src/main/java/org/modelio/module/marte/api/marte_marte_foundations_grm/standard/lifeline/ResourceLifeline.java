/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class ResourceLifeline {
    public static final String STEREOTYPE_NAME = "Resource_Lifeline";

    public static final String RESOURCE_LIFELINE_ISACTIVE_TAGTYPE = "Resource_Lifeline_isActive";

    public static final String RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE = "Resource_Lifeline_isProtected";

    public static final String RESOURCE_LIFELINE_RESMULT_TAGTYPE = "Resource_Lifeline_resMult";

    /**
     * The underlying {@link Lifeline} represented by this proxy, never null.
     */
    protected final Lifeline elt;

    /**
     * Tells whether a {@link ResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << Resource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << Resource_Lifeline >> then instantiate a {@link ResourceLifeline} proxy.
     * 
     * @return a {@link ResourceLifeline} proxy on the created {@link Lifeline}.
     */
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
    public static ResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (ResourceLifeline.canInstantiate(obj))
        	return new ResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("ResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public Lifeline getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Lifeline_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getResource_Lifeline_resMult() {
        return this.elt.getTagValue(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_RESMULT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Lifeline_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Lifeline_isActive() {
        return this.elt.isTagged(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Lifeline_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isResource_Lifeline_isProtected() {
        return this.elt.isTagged(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Lifeline_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setResource_Lifeline_resMult(final String value) {
        this.elt.putTagValue(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_RESMULT_TAGTYPE_ELT, value);
    }

    protected ResourceLifeline(final Lifeline elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RESOURCE_LIFELINE_RESMULT_TAGTYPE_ELT;

        public static TagType RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT;

        public static TagType RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
