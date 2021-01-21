/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << ProcessingResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("256cc64c-8d38-46f8-9169-9b5f6af11495")
public class ProcessingResourceInstance extends ResourceInstance {
    @objid ("193ba2e3-1c6d-44c1-9c1a-0931c298dabb")
    public static final String STEREOTYPE_NAME = "ProcessingResource_Instance";

    @objid ("fce2f6cd-ac91-46d7-a569-b422f5ee215d")
    public static final String PROCESSINGRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE = "ProcessingResource_Instance_mainScheduler";

    @objid ("7a3ef059-8f59-42c3-a297-18bcd430ab36")
    public static final String PROCESSINGRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE = "ProcessingResource_Instance_speedFactor";

    /**
     * Tells whether a {@link ProcessingResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ProcessingResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9f02ca99-7e7f-4198-a712-15dec9d6a98b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ProcessingResource_Instance >> then instantiate a {@link ProcessingResourceInstance} proxy.
     * 
     * @return a {@link ProcessingResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("9319f98c-17d8-4edb-a6ea-7b16f66e1cf3")
    public static ProcessingResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProcessingResourceInstance.STEREOTYPE_NAME);
        return ProcessingResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceInstance} proxy from a {@link Instance} stereotyped << ProcessingResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ProcessingResourceInstance} proxy or <i>null</i>.
     */
    @objid ("65401780-aae9-4865-b906-31d58903d318")
    public static ProcessingResourceInstance instantiate(final Instance obj) {
        return ProcessingResourceInstance.canInstantiate(obj) ? new ProcessingResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProcessingResourceInstance} proxy from a {@link Instance} stereotyped << ProcessingResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link ProcessingResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2808093a-a951-485f-8a06-350cd84e96b9")
    public static ProcessingResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ProcessingResourceInstance.canInstantiate(obj))
        	return new ProcessingResourceInstance(obj);
        else
        	throw new IllegalArgumentException("ProcessingResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("24e81113-74d2-41d3-bc9d-d02cc9bbbf0a")
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
        ProcessingResourceInstance other = (ProcessingResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("f4aed42b-15be-44ee-a584-8d133559f0eb")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'ProcessingResource_Instance_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f1d3b57-940e-4d45-91bb-3814396054ec")
    public String getProcessingResource_Instance_mainScheduler() {
        return this.elt.getTagValue(ProcessingResourceInstance.MdaTypes.PROCESSINGRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ProcessingResource_Instance_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac5a4e85-59ed-49b1-bfb9-e4cc04d67851")
    public String getProcessingResource_Instance_speedFactor() {
        return this.elt.getTagValue(ProcessingResourceInstance.MdaTypes.PROCESSINGRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("073cda5c-ef3c-4caf-895d-1a8c7791f1ad")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'ProcessingResource_Instance_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ead2fd88-b9eb-4b3f-90c5-258a9efddbe7")
    public void setProcessingResource_Instance_mainScheduler(final String value) {
        this.elt.putTagValue(ProcessingResourceInstance.MdaTypes.PROCESSINGRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ProcessingResource_Instance_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a494d39-9b24-4b12-adc1-401e12a8377f")
    public void setProcessingResource_Instance_speedFactor(final String value) {
        this.elt.putTagValue(ProcessingResourceInstance.MdaTypes.PROCESSINGRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("b981c5af-1b55-4ece-881b-f28558c5206e")
    protected ProcessingResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("fb0e3e0d-fc44-4ff2-be47-c31759c16f52")
    public static final class MdaTypes {
        @objid ("2d3879cd-0cc8-4979-8b3d-0afa6ba3c8c8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("47743374-2433-4aa3-af22-8469f2d14576")
        public static TagType PROCESSINGRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("074aa2c8-3ffa-44c8-b36d-632e7dbe5aef")
        public static TagType PROCESSINGRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("940f1632-9142-45b4-b8de-43905fe94317")
        private static Stereotype MDAASSOCDEP;

        @objid ("8cfa4e22-51b3-4f48-b704-f4e03e93ef93")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4819fc52-5a52-4137-a9a5-3cefdec1aab3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00935ddb-0ccf-11df-8525-001302895b2b");
            PROCESSINGRESOURCE_INSTANCE_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00935de2-0ccf-11df-8525-001302895b2b");
            PROCESSINGRESOURCE_INSTANCE_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00935de9-0ccf-11df-8525-001302895b2b");
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
