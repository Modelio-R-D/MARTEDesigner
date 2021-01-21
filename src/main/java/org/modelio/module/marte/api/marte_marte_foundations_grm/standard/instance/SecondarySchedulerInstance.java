/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Instance} with << SecondaryScheduler_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("23c21dfd-804f-4d8b-88cc-6973c65ab0ae")
public class SecondarySchedulerInstance extends SchedulerInstance {
    @objid ("a0d7c41a-2d27-4e74-add9-cfa18ff05d76")
    public static final String STEREOTYPE_NAME = "SecondaryScheduler_Instance";

    @objid ("0a5c8a25-3d40-455a-9a07-3e0e387d3594")
    public static final String SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS_TAGTYPE = "SecondaryScheduler_Instance_virtualProcessingUnits";

    /**
     * Tells whether a {@link SecondarySchedulerInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SecondaryScheduler_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ef6ce381-fd65-4d3f-b1d3-a29056545275")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SecondaryScheduler_Instance >> then instantiate a {@link SecondarySchedulerInstance} proxy.
     * 
     * @return a {@link SecondarySchedulerInstance} proxy on the created {@link Instance}.
     */
    @objid ("2fc0b7dd-2f05-404d-af69-5f89b6374194")
    public static SecondarySchedulerInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerInstance.STEREOTYPE_NAME);
        return SecondarySchedulerInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerInstance} proxy from a {@link Instance} stereotyped << SecondaryScheduler_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SecondarySchedulerInstance} proxy or <i>null</i>.
     */
    @objid ("58b28f3b-3225-434e-875e-84dacb468e42")
    public static SecondarySchedulerInstance instantiate(final Instance obj) {
        return SecondarySchedulerInstance.canInstantiate(obj) ? new SecondarySchedulerInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerInstance} proxy from a {@link Instance} stereotyped << SecondaryScheduler_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SecondarySchedulerInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cf523063-82c5-4515-9c4a-20dc250f0d43")
    public static SecondarySchedulerInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SecondarySchedulerInstance.canInstantiate(obj))
        	return new SecondarySchedulerInstance(obj);
        else
        	throw new IllegalArgumentException("SecondarySchedulerInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0b7a53e7-4072-43e7-8202-84cfab661c0c")
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
        SecondarySchedulerInstance other = (SecondarySchedulerInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("af0d4961-f35c-4243-9db9-db3e7333e6c2")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SecondaryScheduler_Instance_virtualProcessingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1b1a5107-7027-47e6-941d-0bbce079b4e3")
    public List<String> getSecondaryScheduler_Instance_virtualProcessingUnits() {
        return this.elt.getTagValues(SecondarySchedulerInstance.MdaTypes.SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT);
    }

    @objid ("68c00f90-f26a-478f-b041-7b24fd111d6a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SecondaryScheduler_Instance_virtualProcessingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cf6e50d0-a144-456a-9686-d97f2a1c234d")
    public void setSecondaryScheduler_Instance_virtualProcessingUnits(final List<String> values) {
        this.elt.putTagValues(SecondarySchedulerInstance.MdaTypes.SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    @objid ("53c5599e-5104-4ad5-9abf-e49e7f7dd1ee")
    protected SecondarySchedulerInstance(final Instance elt) {
        super(elt);
    }

    @objid ("7d40b962-83bb-4f03-bd2b-a48a44e9db68")
    public static final class MdaTypes {
        @objid ("405266d3-6681-4190-8936-4df5f730ec52")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bc96b08c-72f2-4d68-9c81-77514e4103c8")
        public static TagType SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("9db5bbcd-4b5a-4217-92d5-221e4e45ca0a")
        private static Stereotype MDAASSOCDEP;

        @objid ("0757036c-ec01-47a8-ba01-c11bf34c1374")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3fd191d2-bc1f-4386-b3c3-2f3202eead85")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8297df2e-0f41-11df-8c52-0014222a9f79");
            SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7cc5c223-16fa-11df-b92a-0014222a9f79");
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
