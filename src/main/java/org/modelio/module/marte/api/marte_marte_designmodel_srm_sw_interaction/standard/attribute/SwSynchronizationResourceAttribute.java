/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SwSynchronizationResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f5026788-df5a-4165-89ed-89e5d34dcbc6")
public class SwSynchronizationResourceAttribute extends SwInteractionResourceAttribute {
    @objid ("ddef96b0-a4cf-4e05-a2cd-a98eea5f7bc0")
    public static final String STEREOTYPE_NAME = "SwSynchronizationResource_Attribute";

    /**
     * Tells whether a {@link SwSynchronizationResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwSynchronizationResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5a675ce3-1813-4198-b0e7-653c9ce84051")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwSynchronizationResource_Attribute >> then instantiate a {@link SwSynchronizationResourceAttribute} proxy.
     * 
     * @return a {@link SwSynchronizationResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("8dab778e-2ed3-44b2-83d2-0fbbe190f6a0")
    public static SwSynchronizationResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceAttribute.STEREOTYPE_NAME);
        return SwSynchronizationResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceAttribute} proxy from a {@link Attribute} stereotyped << SwSynchronizationResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwSynchronizationResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("76a6a31a-12e5-43ec-8609-435750602f50")
    public static SwSynchronizationResourceAttribute instantiate(final Attribute obj) {
        return SwSynchronizationResourceAttribute.canInstantiate(obj) ? new SwSynchronizationResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceAttribute} proxy from a {@link Attribute} stereotyped << SwSynchronizationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwSynchronizationResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("071579e3-bedf-43f9-84c0-32e1821f6bc0")
    public static SwSynchronizationResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwSynchronizationResourceAttribute.canInstantiate(obj))
        	return new SwSynchronizationResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwSynchronizationResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c14d7527-4916-4bdb-b815-77e9112c8e35")
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
        SwSynchronizationResourceAttribute other = (SwSynchronizationResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("cf2c4c13-6d65-4248-be75-847aaa869f35")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("24aab0c4-7e1d-4151-a213-4b207786db26")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("96fd8265-340d-48b3-95ef-d8e9aee84b76")
    protected SwSynchronizationResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("fd295b4a-6d12-4d18-823b-a91d646ebe68")
    public static final class MdaTypes {
        @objid ("d0026c8a-4594-44a8-81cb-d6f55fe1673a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f88a85a3-49e4-498b-b4df-7bd4de5f8ceb")
        private static Stereotype MDAASSOCDEP;

        @objid ("ae0617f5-3dff-48e5-a51a-957567fb3ae9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31d8cbb7-15f0-459c-b37e-2eb4e1672912")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0217f811-0ccf-11df-8525-001302895b2b");
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
