/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.TimerResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SwTimerResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d3dba01d-fee8-40bc-977c-376d92789924")
public class SwTimerResourceInstance extends TimerResourceInstance {
    @objid ("ea6e9394-c027-43a4-965c-e8e4c092b9d0")
    public static final String STEREOTYPE_NAME = "SwTimerResource_Instance";

    /**
     * Tells whether a {@link SwTimerResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwTimerResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0065ad7b-c907-476b-a918-21ff7bd72de1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwTimerResource_Instance >> then instantiate a {@link SwTimerResourceInstance} proxy.
     * 
     * @return a {@link SwTimerResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("66ca8b6d-2f9f-4b42-b299-f82732efe787")
    public static SwTimerResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceInstance.STEREOTYPE_NAME);
        return SwTimerResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceInstance} proxy from a {@link Instance} stereotyped << SwTimerResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwTimerResourceInstance} proxy or <i>null</i>.
     */
    @objid ("7db9c4cb-12b6-4d3e-a04f-dd8087b3731c")
    public static SwTimerResourceInstance instantiate(final Instance obj) {
        return SwTimerResourceInstance.canInstantiate(obj) ? new SwTimerResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceInstance} proxy from a {@link Instance} stereotyped << SwTimerResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SwTimerResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a3e1c35b-0a2f-4509-859c-929d8c2cb68a")
    public static SwTimerResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwTimerResourceInstance.canInstantiate(obj))
        	return new SwTimerResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwTimerResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f9252979-4d86-44b6-8f3d-85b4b7eb7167")
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
        SwTimerResourceInstance other = (SwTimerResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("da40c311-68b0-44bd-a93e-7207c1ef93ca")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("4060de26-0554-4870-88fb-882f777a2cf1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("03a77bd9-1659-49f9-8398-29354f3b1250")
    protected SwTimerResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("634b3517-e799-4bfb-9525-ae0641645aa6")
    public static final class MdaTypes {
        @objid ("06686c25-5c4b-4363-a5f0-0e8ce0afcd38")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("93e33e27-b683-4841-a20c-18d68e0c1375")
        private static Stereotype MDAASSOCDEP;

        @objid ("87f4a78d-782c-480b-a985-42a2275de814")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fa05c0b6-5d00-461c-8f78-b783964ea837")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01dec064-0ccf-11df-8525-001302895b2b");
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
