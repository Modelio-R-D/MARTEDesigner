/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.bindableinstance;

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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link BindableInstance} with << Nfp_BindableInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7ac11866-6b79-473f-b121-422cdbdd0f1e")
public class NfpBindableInstance {
    @objid ("c75cfac5-831e-43e9-9cd3-c85f3cfd1a73")
    public static final String STEREOTYPE_NAME = "Nfp_BindableInstance";

    /**
     * The underlying {@link BindableInstance} represented by this proxy, never null.
     */
    @objid ("31e1055f-f67a-4342-8c86-d7f4af015f0a")
    protected final BindableInstance elt;

    /**
     * Tells whether a {@link NfpBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << Nfp_BindableInstance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bcbab0f3-9682-48ca-95d6-018919bbc185")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NfpBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << Nfp_BindableInstance >> then instantiate a {@link NfpBindableInstance} proxy.
     * 
     * @return a {@link NfpBindableInstance} proxy on the created {@link BindableInstance}.
     */
    @objid ("30dbbee0-e0a2-4c31-9d48-441390c2f436")
    public static NfpBindableInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("BindableInstance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NfpBindableInstance.STEREOTYPE_NAME);
        return NfpBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link NfpBindableInstance} proxy from a {@link BindableInstance} stereotyped << Nfp_BindableInstance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link NfpBindableInstance} proxy or <i>null</i>.
     */
    @objid ("13be02db-cfcc-47e7-b02f-f13a6ee59694")
    public static NfpBindableInstance instantiate(final BindableInstance obj) {
        return NfpBindableInstance.canInstantiate(obj) ? new NfpBindableInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NfpBindableInstance} proxy from a {@link BindableInstance} stereotyped << Nfp_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link BindableInstance}
     * @return a {@link NfpBindableInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0885a0da-1753-4a2e-97eb-2709e55e4ee9")
    public static NfpBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (NfpBindableInstance.canInstantiate(obj))
        	return new NfpBindableInstance(obj);
        else
        	throw new IllegalArgumentException("NfpBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5bcb612e-661e-48d5-94dc-2b69bdb6f63a")
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
        NfpBindableInstance other = (NfpBindableInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link BindableInstance}. 
     * @return the BindableInstance represented by this proxy, never null.
     */
    @objid ("91a906d4-e5f1-4b64-889c-db9a095789ee")
    public BindableInstance getElement() {
        return this.elt;
    }

    @objid ("e985cb84-f6d1-4e6b-baea-d9945aebb462")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fe53cef0-836b-4128-96f9-56dcc65f96b9")
    protected NfpBindableInstance(final BindableInstance elt) {
        this.elt = elt;
    }

    @objid ("7b41a3d4-509e-40f6-8b1b-1e0b6a1d14ca")
    public static final class MdaTypes {
        @objid ("ebe6bd97-b6f0-4ec1-8bdf-f1cdc5b62268")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1691b767-64c3-4ddd-bcfc-ea925278d9a2")
        private static Stereotype MDAASSOCDEP;

        @objid ("fa3780cb-f468-405a-8a8c-2cd8549c9f7f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d71776e3-af14-4260-863c-6a0336a63e28")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9490073-0cce-11df-8525-001302895b2b");
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
