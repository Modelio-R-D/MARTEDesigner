/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("4189f34c-713a-48d6-8bc7-4050aaf8ec66")
    public static final String STEREOTYPE_NAME = "Nfp_BindableInstance";

    /**
     * The underlying {@link BindableInstance} represented by this proxy, never null.
     */
    @objid ("b7f07aa5-575e-454d-bf19-afef73fb2da4")
    protected final BindableInstance elt;

    /**
     * Tells whether a {@link NfpBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << Nfp_BindableInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bc82d8c3-f29b-4e0e-92f3-827e09bc3ca7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NfpBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << Nfp_BindableInstance >> then instantiate a {@link NfpBindableInstance} proxy.
     * 
     * @return a {@link NfpBindableInstance} proxy on the created {@link BindableInstance}.
     */
    @objid ("824430ae-db0d-4d1b-b1e9-0306086d4da0")
    public static NfpBindableInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.BindableInstance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NfpBindableInstance.STEREOTYPE_NAME);
        return NfpBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link NfpBindableInstance} proxy from a {@link BindableInstance} stereotyped << Nfp_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link NfpBindableInstance} proxy or <i>null</i>.
     */
    @objid ("e77e1aa0-de6f-49a9-8713-02ec5b37ca70")
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
    @objid ("8848b0a3-5795-4867-93ef-9baf848ea054")
    public static NfpBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (NfpBindableInstance.canInstantiate(obj))
        	return new NfpBindableInstance(obj);
        else
        	throw new IllegalArgumentException("NfpBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8525d197-fc37-4556-be9f-69853488b885")
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
    @objid ("2b1ffcb0-efa6-4b3a-a098-a9d36c70b281")
    public BindableInstance getElement() {
        return this.elt;
    }

    @objid ("f4bd8c71-1a1c-4c51-be93-1be3882b6fcd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5b79df14-e088-4a59-b45b-28dbc287bcc2")
    protected NfpBindableInstance(final BindableInstance elt) {
        this.elt = elt;
    }

    @objid ("7b41a3d4-509e-40f6-8b1b-1e0b6a1d14ca")
    public static final class MdaTypes {
        @objid ("94a062db-fbd4-4b09-a102-b256301d6055")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e61afb7c-8f86-4541-be6b-1a1e13bc1641")
        private static Stereotype MDAASSOCDEP;

        @objid ("b49c1f99-3609-4e67-98f6-2adc8dda168f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("34e99a64-2bb0-4e77-9788-0e5049726ee9")
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
