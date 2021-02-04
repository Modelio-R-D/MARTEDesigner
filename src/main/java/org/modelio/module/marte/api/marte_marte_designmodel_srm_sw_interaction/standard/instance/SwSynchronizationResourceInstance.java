/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("85034e8a-2fec-4b55-80fe-a94837789cd0")
    public static final String STEREOTYPE_NAME = "SwSynchronizationResource_Instance";

    /**
     * Tells whether a {@link SwSynchronizationResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwSynchronizationResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d6a1b4a1-bad6-409c-b803-774c9a8d7da8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwSynchronizationResource_Instance >> then instantiate a {@link SwSynchronizationResourceInstance} proxy.
     * 
     * @return a {@link SwSynchronizationResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("882e2e19-b61a-4f3c-87b1-0cca53d4411c")
    public static SwSynchronizationResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceInstance.STEREOTYPE_NAME);
        return SwSynchronizationResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceInstance} proxy from a {@link Instance} stereotyped << SwSynchronizationResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwSynchronizationResourceInstance} proxy or <i>null</i>.
     */
    @objid ("c1764e07-5722-4608-9051-9b94bc59ca3f")
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
    @objid ("370ddca8-3ad9-4303-af8e-d2fe8b28ff82")
    public static SwSynchronizationResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwSynchronizationResourceInstance.canInstantiate(obj))
        	return new SwSynchronizationResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwSynchronizationResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e286eccf-8720-4568-a768-ffcfec8fad42")
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
    @objid ("1a27d22e-9614-45d3-9aef-47c26aa25477")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("374598be-316a-466c-9dea-d9de053b8b33")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("26d8b5d1-2cb6-4037-b66c-a802a8ba4e0d")
    protected SwSynchronizationResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("00194a42-532b-41ab-b03d-889809e75ef0")
    public static final class MdaTypes {
        @objid ("6fb61250-d26b-40d9-b665-ddc8b856789f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5ae3324f-04ef-4cfa-8522-2b3fd555987d")
        private static Stereotype MDAASSOCDEP;

        @objid ("dfa5f861-690c-48ed-8287-6fdacb7d5f04")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("55c9b0b6-3ece-41c4-bb96-921d95c397e8")
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
