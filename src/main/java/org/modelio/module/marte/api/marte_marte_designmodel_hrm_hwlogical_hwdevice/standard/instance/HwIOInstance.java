/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << HwI_O_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cf330db6-4905-441b-a1e9-7cfae40ce077")
public class HwIOInstance extends HwDeviceInstance {
    @objid ("9a4994c9-5a61-4e87-b747-7579e4171282")
    public static final String STEREOTYPE_NAME = "HwI_O_Instance";

    /**
     * Tells whether a {@link HwIOInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwI_O_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d4a80d5b-bac4-4cc4-b080-f743dbe39bd3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwIOInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwI_O_Instance >> then instantiate a {@link HwIOInstance} proxy.
     * 
     * @return a {@link HwIOInstance} proxy on the created {@link Instance}.
     */
    @objid ("bafa9767-ea95-4c52-9ea8-206bc16d29d8")
    public static HwIOInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwIOInstance.STEREOTYPE_NAME);
        return HwIOInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwIOInstance} proxy from a {@link Instance} stereotyped << HwI_O_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwIOInstance} proxy or <i>null</i>.
     */
    @objid ("d2c9f20d-1a22-4ce2-83db-66e2663619fc")
    public static HwIOInstance instantiate(final Instance obj) {
        return HwIOInstance.canInstantiate(obj) ? new HwIOInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwIOInstance} proxy from a {@link Instance} stereotyped << HwI_O_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwIOInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dfe320d3-c463-41ab-b8fe-9d3eb1ef4d0a")
    public static HwIOInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwIOInstance.canInstantiate(obj))
        	return new HwIOInstance(obj);
        else
        	throw new IllegalArgumentException("HwIOInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dc5a7e29-c9ad-4bfc-8db6-f735b6c0e8b6")
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
        HwIOInstance other = (HwIOInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("ae97a49a-69a8-40a1-af47-1cc2b32efe66")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("e7551dc7-7f6a-482c-a7ef-0bd04ab34536")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3c44068d-4e05-4aaf-8d59-9de972fe2a35")
    protected HwIOInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ecdcdb79-cdbc-442e-a776-7c6a53482fb6")
    public static final class MdaTypes {
        @objid ("522230a3-b870-47cb-8c0b-fae7880205b7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e2265b1-8cc1-48c1-8e28-5f70d784621e")
        private static Stereotype MDAASSOCDEP;

        @objid ("4fab3ccb-9a84-4b74-8dfc-8eb8f89c6b6c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7d0b76d8-2982-4981-833f-90e60623f6e9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0137ddf8-0ccf-11df-8525-001302895b2b");
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
