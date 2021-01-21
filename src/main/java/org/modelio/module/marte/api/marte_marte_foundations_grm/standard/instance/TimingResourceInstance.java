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
 * Proxy class to handle a {@link Instance} with << TimingResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("282e7e38-8ccf-497f-af27-321b63cfe3a3")
public class TimingResourceInstance extends ResourceInstance {
    @objid ("95167bf9-a49c-4f1b-81a2-95d726485616")
    public static final String STEREOTYPE_NAME = "TimingResource_Instance";

    /**
     * Tells whether a {@link TimingResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << TimingResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c6e09e8c-b08f-44fa-ab00-7be186af9734")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << TimingResource_Instance >> then instantiate a {@link TimingResourceInstance} proxy.
     * 
     * @return a {@link TimingResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("3a8dbdce-a2e9-4328-b2c5-c4bd8a840674")
    public static TimingResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceInstance.STEREOTYPE_NAME);
        return TimingResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link TimingResourceInstance} proxy from a {@link Instance} stereotyped << TimingResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link TimingResourceInstance} proxy or <i>null</i>.
     */
    @objid ("ac96a348-133f-4e1c-9fb6-170a7c8e0796")
    public static TimingResourceInstance instantiate(final Instance obj) {
        return TimingResourceInstance.canInstantiate(obj) ? new TimingResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimingResourceInstance} proxy from a {@link Instance} stereotyped << TimingResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link TimingResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("724d6cce-1158-461a-8955-5e4229ad4b43")
    public static TimingResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (TimingResourceInstance.canInstantiate(obj))
        	return new TimingResourceInstance(obj);
        else
        	throw new IllegalArgumentException("TimingResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4bec68c0-774c-49eb-94be-3602d6c571c6")
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
        TimingResourceInstance other = (TimingResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("f49ec497-62c9-4775-b623-71c33a481b5c")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("3a865f1d-c7bd-47cd-ae53-2cf2f1afd727")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c6a69243-5386-42a0-a325-bb49eccebcb0")
    protected TimingResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("5f9e6d25-a67b-40ff-b9c9-c6a80621421c")
    public static final class MdaTypes {
        @objid ("ed2f31b7-89b8-43c2-bb85-f699b0e73f89")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("712b0cb6-a68f-4fc3-95e5-c87aff2b2d3f")
        private static Stereotype MDAASSOCDEP;

        @objid ("51963198-c37c-49eb-906d-9a9cb491cdec")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("954989ae-1d12-4b41-9e30-8de6ec3ffb19")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009ce725-0ccf-11df-8525-001302895b2b");
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
