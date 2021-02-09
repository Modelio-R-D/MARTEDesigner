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
 * Proxy class to handle a {@link Lifeline} with << ProcessingResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ProcessingResourceLifeline extends ResourceLifeline {
    public static final String STEREOTYPE_NAME = "ProcessingResource_Lifeline";

    public static final String PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE = "ProcessingResource_Lifeline_mainScheduler";

    public static final String PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE = "ProcessingResource_Lifeline_speedFactor";

    /**
     * Tells whether a {@link ProcessingResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << ProcessingResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << ProcessingResource_Lifeline >> then instantiate a {@link ProcessingResourceLifeline} proxy.
     * 
     * @return a {@link ProcessingResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static ProcessingResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceLifeline.STEREOTYPE_NAME);
        return ProcessingResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceLifeline} proxy from a {@link Lifeline} stereotyped << ProcessingResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link ProcessingResourceLifeline} proxy or <i>null</i>.
     */
    public static ProcessingResourceLifeline instantiate(final Lifeline obj) {
        return ProcessingResourceLifeline.canInstantiate(obj) ? new ProcessingResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceLifeline} proxy from a {@link Lifeline} stereotyped << ProcessingResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link ProcessingResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ProcessingResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (ProcessingResourceLifeline.canInstantiate(obj))
        	return new ProcessingResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("ProcessingResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ProcessingResourceLifeline other = (ProcessingResourceLifeline) obj;
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
     * Getter for string property 'ProcessingResource_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getProcessingResource_Lifeline_mainScheduler() {
        return this.elt.getTagValue(ProcessingResourceLifeline.MdaTypes.PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ProcessingResource_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getProcessingResource_Lifeline_speedFactor() {
        return this.elt.getTagValue(ProcessingResourceLifeline.MdaTypes.PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ProcessingResource_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setProcessingResource_Lifeline_mainScheduler(final String value) {
        this.elt.putTagValue(ProcessingResourceLifeline.MdaTypes.PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ProcessingResource_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setProcessingResource_Lifeline_speedFactor(final String value) {
        this.elt.putTagValue(ProcessingResourceLifeline.MdaTypes.PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    protected ProcessingResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT;

        public static TagType PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aa368037-1018-11df-86fe-0014222a9f79");
            PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c03d3560-1018-11df-86fe-0014222a9f79");
            PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c03d3561-1018-11df-86fe-0014222a9f79");
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
