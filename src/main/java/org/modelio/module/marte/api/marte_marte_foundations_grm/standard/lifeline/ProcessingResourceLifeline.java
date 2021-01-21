/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Lifeline} with << ProcessingResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6f7d8de9-b186-43a6-8675-4cc5984580a1")
public class ProcessingResourceLifeline extends ResourceLifeline {
    @objid ("912b5ae0-e622-48fb-a62f-67236283fa8b")
    public static final String STEREOTYPE_NAME = "ProcessingResource_Lifeline";

    @objid ("140523b8-2a33-445f-9ceb-0fc3df369a4f")
    public static final String PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE = "ProcessingResource_Lifeline_mainScheduler";

    @objid ("2c21fe0e-269f-4be2-821c-5f952889be5b")
    public static final String PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE = "ProcessingResource_Lifeline_speedFactor";

    /**
     * Tells whether a {@link ProcessingResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << ProcessingResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5251dafb-d9f2-4951-8398-92763248b314")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << ProcessingResource_Lifeline >> then instantiate a {@link ProcessingResourceLifeline} proxy.
     * 
     * @return a {@link ProcessingResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("ed7ab070-155d-46ad-bba9-afe1c819bd80")
    public static ProcessingResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceLifeline.STEREOTYPE_NAME);
        return ProcessingResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceLifeline} proxy from a {@link Lifeline} stereotyped << ProcessingResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link ProcessingResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("8ad7f329-e57c-4e90-a672-73a194a103e2")
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
    @objid ("eb9b0139-69c1-4f83-a3b6-c34c65ae3ae8")
    public static ProcessingResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (ProcessingResourceLifeline.canInstantiate(obj))
        	return new ProcessingResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("ProcessingResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c8c7c783-6961-43e3-970b-de7f833da587")
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
    @objid ("f5239771-bbb9-4d78-ace0-8234076f0720")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'ProcessingResource_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("afde67b0-4683-4efb-a0aa-f4f484ea8dda")
    public String getProcessingResource_Lifeline_mainScheduler() {
        return this.elt.getTagValue(ProcessingResourceLifeline.MdaTypes.PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ProcessingResource_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3f146b1-27db-491d-9c5e-cd289b8b48a0")
    public String getProcessingResource_Lifeline_speedFactor() {
        return this.elt.getTagValue(ProcessingResourceLifeline.MdaTypes.PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("574af2b3-20b6-4c97-813a-c5a85ee76f42")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ProcessingResource_Lifeline_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d58f7d5-a624-454e-a7c7-061f9ca779d2")
    public void setProcessingResource_Lifeline_mainScheduler(final String value) {
        this.elt.putTagValue(ProcessingResourceLifeline.MdaTypes.PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ProcessingResource_Lifeline_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea4a9b93-0456-4476-9708-7bd9004e6dd0")
    public void setProcessingResource_Lifeline_speedFactor(final String value) {
        this.elt.putTagValue(ProcessingResourceLifeline.MdaTypes.PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("a2decde3-a617-4c22-8ef3-33ce0bcbbb8f")
    protected ProcessingResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("6c4cdcc6-3213-40a4-962b-b50738f0c507")
    public static final class MdaTypes {
        @objid ("41d04505-5ae7-4d3b-a26d-9127a9105468")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("31eb94bc-1007-46d8-ab52-ed094f1cb40b")
        public static TagType PROCESSINGRESOURCE_LIFELINE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("62f1d922-c40e-4cd3-95b0-4645a9a14b2c")
        public static TagType PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("c31c569f-1955-4e24-8be0-eb5ab62c3d69")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a6dc98d-a0ac-4c31-b656-f0bdb78d48d0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0130e663-6a1c-4e2e-9f5a-7a2efaecbf08")
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
