/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Lifeline} with << SharedDataComResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SharedDataComResourceLifeline extends SwCommunicationResourceLifeline {
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Lifeline";

    public static final String SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE = "SharedDataComResource_Lifeline_readServices";

    public static final String SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE = "SharedDataComResource_Lifeline_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >> then instantiate a {@link SharedDataComResourceLifeline} proxy.
     * 
     * @return a {@link SharedDataComResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static SharedDataComResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceLifeline.STEREOTYPE_NAME);
        return SharedDataComResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceLifeline} proxy from a {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SharedDataComResourceLifeline} proxy or <i>null</i>.
     */
    public static SharedDataComResourceLifeline instantiate(final Lifeline obj) {
        return SharedDataComResourceLifeline.canInstantiate(obj) ? new SharedDataComResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceLifeline} proxy from a {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SharedDataComResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SharedDataComResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SharedDataComResourceLifeline.canInstantiate(obj))
        	return new SharedDataComResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SharedDataComResourceLifeline other = (SharedDataComResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Lifeline_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSharedDataComResource_Lifeline_readServices() {
        return this.elt.getTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Lifeline_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSharedDataComResource_Lifeline_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Lifeline_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSharedDataComResource_Lifeline_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Lifeline_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSharedDataComResource_Lifeline_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    protected SharedDataComResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT;

        public static TagType SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2da741a4-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2da741a5-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2da741a6-10d8-11df-81d9-0014222a9f79");
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
