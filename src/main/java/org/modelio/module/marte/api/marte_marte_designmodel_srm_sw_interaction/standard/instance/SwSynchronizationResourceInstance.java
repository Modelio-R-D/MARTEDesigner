/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << SwSynchronizationResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("917a72df-5329-4d61-93b0-9090f30a2b05")
public class SwSynchronizationResourceInstance extends SwInteractionResourceInstance {
    @objid ("217e5080-081f-4e08-8e27-4b70f68143f3")
    public static final String STEREOTYPE_NAME = "SwSynchronizationResource_Instance";

    /**
     * Tells whether a {@link SwSynchronizationResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwSynchronizationResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("41624cb3-b564-43c9-a37b-4befc0972222")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwSynchronizationResource_Instance >> then instantiate a {@link SwSynchronizationResourceInstance} proxy.
     * 
     * @return a {@link SwSynchronizationResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("3b0e9425-8ef5-4929-a009-6754dafc6703")
    public static SwSynchronizationResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceInstance.STEREOTYPE_NAME);
        return SwSynchronizationResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceInstance} proxy from a {@link Instance} stereotyped << SwSynchronizationResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwSynchronizationResourceInstance} proxy or <i>null</i>.
     */
    @objid ("11320f19-05f1-465e-8972-d70f8df1eb33")
    public static SwSynchronizationResourceInstance instantiate(final Instance obj) {
        return SwSynchronizationResourceInstance.canInstantiate(obj) ? new SwSynchronizationResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceInstance} proxy from a {@link Instance} stereotyped << SwSynchronizationResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SwSynchronizationResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0b433597-aca8-44e2-a182-ee650369a443")
    public static SwSynchronizationResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwSynchronizationResourceInstance.canInstantiate(obj))
        	return new SwSynchronizationResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwSynchronizationResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e73f7e2c-4130-401f-8689-abebd203c729")
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
        SwSynchronizationResourceInstance other = (SwSynchronizationResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("5fd48ad9-1b1b-4341-bee7-b006f87d6ab9")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("6bea0812-c285-4f46-8ba4-fa29add44709")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("416875db-f2ed-4d41-8173-418d6a8d0575")
    protected SwSynchronizationResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("00194a42-532b-41ab-b03d-889809e75ef0")
    public static final class MdaTypes {
        @objid ("4a0b4e9f-1eca-46e2-96c1-f24b78f7c990")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0dedfb33-ede5-49c5-a1ae-fc18130815c2")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed63f10a-e986-47f4-b0f4-6274d6ffa5dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("55eda03c-4190-4a7a-ac1d-8017f4db1ae4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0217f814-0ccf-11df-8525-001302895b2b");
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
