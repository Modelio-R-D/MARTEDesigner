/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << ProcessingResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ProcessingResourceAssociation extends ResourceAssociation {
    public static final String STEREOTYPE_NAME = "ProcessingResource_Association";

    public static final String PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE = "ProcessingResource_Association_mainScheduler";

    public static final String PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE = "ProcessingResource_Association_speedFactor";

    /**
     * Tells whether a {@link ProcessingResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << ProcessingResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << ProcessingResource_Association >> then instantiate a {@link ProcessingResourceAssociation} proxy.
     * 
     * @return a {@link ProcessingResourceAssociation} proxy on the created {@link Association}.
     */
    public static ProcessingResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceAssociation.STEREOTYPE_NAME);
        return ProcessingResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceAssociation} proxy from a {@link Association} stereotyped << ProcessingResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link ProcessingResourceAssociation} proxy or <i>null</i>.
     */
    public static ProcessingResourceAssociation instantiate(final Association obj) {
        return ProcessingResourceAssociation.canInstantiate(obj) ? new ProcessingResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceAssociation} proxy from a {@link Association} stereotyped << ProcessingResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link ProcessingResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ProcessingResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (ProcessingResourceAssociation.canInstantiate(obj))
        	return new ProcessingResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("ProcessingResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ProcessingResourceAssociation other = (ProcessingResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'ProcessingResource_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getProcessingResource_Association_mainScheduler() {
        return this.elt.getTagValue(ProcessingResourceAssociation.MdaTypes.PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ProcessingResource_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getProcessingResource_Association_speedFactor() {
        return this.elt.getTagValue(ProcessingResourceAssociation.MdaTypes.PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ProcessingResource_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setProcessingResource_Association_mainScheduler(final String value) {
        this.elt.putTagValue(ProcessingResourceAssociation.MdaTypes.PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ProcessingResource_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setProcessingResource_Association_speedFactor(final String value) {
        this.elt.putTagValue(ProcessingResourceAssociation.MdaTypes.PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    protected ProcessingResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT;

        public static TagType PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9f8a2be5-1018-11df-86fe-0014222a9f79");
            PROCESSINGRESOURCE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bf2d67f6-1018-11df-86fe-0014222a9f79");
            PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bf2d67f7-1018-11df-86fe-0014222a9f79");
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
