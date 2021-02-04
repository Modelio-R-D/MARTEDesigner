/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("61314761-a6a4-44e0-8297-1bb47e9a9c9b")
    public static final String STEREOTYPE_NAME = "SwTimerResource_Instance";

    /**
     * Tells whether a {@link SwTimerResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwTimerResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d64a22f0-09a6-4b1e-a404-3ecf9fff5546")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwTimerResource_Instance >> then instantiate a {@link SwTimerResourceInstance} proxy.
     * 
     * @return a {@link SwTimerResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("85b0974b-0f70-4caf-aa90-56cdb606f3cb")
    public static SwTimerResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceInstance.STEREOTYPE_NAME);
        return SwTimerResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceInstance} proxy from a {@link Instance} stereotyped << SwTimerResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwTimerResourceInstance} proxy or <i>null</i>.
     */
    @objid ("e151e42e-9279-4260-8ee5-c25f44a56e03")
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
    @objid ("cf7703d1-1010-4f5b-9209-ccc299530794")
    public static SwTimerResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwTimerResourceInstance.canInstantiate(obj))
        	return new SwTimerResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwTimerResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("66878d8d-9582-4797-b55a-96dc296921e9")
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
    @objid ("e24559fb-7692-40bf-9a7b-9a45f4ea74bc")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("c15ae3d1-ed83-4d0e-be0c-98c93a47002e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("60f6ce65-4610-4775-a944-e8a7908375f7")
    protected SwTimerResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("634b3517-e799-4bfb-9525-ae0641645aa6")
    public static final class MdaTypes {
        @objid ("6c53d761-b191-4343-a0df-9037d318f354")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("90e9e552-76ed-469e-b0a0-7f1d426e16ac")
        private static Stereotype MDAASSOCDEP;

        @objid ("baa58ff6-7c57-4b11-925e-adf8f180850d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3a9fd27a-bfad-41f4-bfcb-b8ccd27f6e17")
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
