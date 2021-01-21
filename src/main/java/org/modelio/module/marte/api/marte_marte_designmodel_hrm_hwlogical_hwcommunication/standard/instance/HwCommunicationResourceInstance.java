/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.instance.HwResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwCommunicationResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f16ea27d-394e-4927-9f99-57444cafe93d")
public class HwCommunicationResourceInstance extends HwResourceInstance {
    @objid ("34e94a0a-0b91-4c81-ac8d-e1b3ff57a6c8")
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_Instance";

    /**
     * Tells whether a {@link HwCommunicationResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwCommunicationResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bcb85421-ef15-4b60-996f-4a0bfd27c29e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwCommunicationResource_Instance >> then instantiate a {@link HwCommunicationResourceInstance} proxy.
     * 
     * @return a {@link HwCommunicationResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("afdf3e4a-4c5c-4b5e-9d21-b32267fb94b8")
    public static HwCommunicationResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceInstance.STEREOTYPE_NAME);
        return HwCommunicationResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceInstance} proxy from a {@link Instance} stereotyped << HwCommunicationResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwCommunicationResourceInstance} proxy or <i>null</i>.
     */
    @objid ("69053ac3-846c-4ac9-8cc7-19f5c885008c")
    public static HwCommunicationResourceInstance instantiate(final Instance obj) {
        return HwCommunicationResourceInstance.canInstantiate(obj) ? new HwCommunicationResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceInstance} proxy from a {@link Instance} stereotyped << HwCommunicationResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwCommunicationResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("880dea91-7760-4a41-afa3-9babc690e1a9")
    public static HwCommunicationResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwCommunicationResourceInstance.canInstantiate(obj))
        	return new HwCommunicationResourceInstance(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c1faf2f3-7441-4609-a787-b497b9aa3a85")
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
        HwCommunicationResourceInstance other = (HwCommunicationResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("c750e243-83e8-4c06-8283-0f684f3b7f0c")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("bc7e2ef3-8b3e-4c71-9e38-8923eeb7c1d8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6086f9fb-722e-4282-ac7b-8bf7287a55c3")
    protected HwCommunicationResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("b06eed61-7ca0-4114-9fc9-31c839f566f7")
    public static final class MdaTypes {
        @objid ("c125ef98-2633-4f57-a8fb-7485d2696f7e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("22a34405-8271-415c-a9d3-2810243bbd30")
        private static Stereotype MDAASSOCDEP;

        @objid ("f645d20a-45ce-47b0-89b5-3ec5ee15c6db")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ec37d6c7-caea-4c67-9e64-19dbf07bd81e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fea648-0ccf-11df-8525-001302895b2b");
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
