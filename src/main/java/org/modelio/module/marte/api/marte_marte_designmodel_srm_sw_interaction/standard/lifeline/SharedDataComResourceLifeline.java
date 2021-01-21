/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SharedDataComResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1aea26d1-6bc6-4915-a336-13e4039daf1c")
public class SharedDataComResourceLifeline extends SwCommunicationResourceLifeline {
    @objid ("1b823607-1643-48f3-98a0-d091a84a1a8e")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Lifeline";

    @objid ("d796efc5-86b5-409a-a3a4-12f21f7fe398")
    public static final String SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE = "SharedDataComResource_Lifeline_readServices";

    @objid ("e2ca7055-0a9e-4c40-8332-7d8446cdb6b5")
    public static final String SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE = "SharedDataComResource_Lifeline_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0cbb7ddc-9190-4c8d-aa0d-6684c102aa7b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >> then instantiate a {@link SharedDataComResourceLifeline} proxy.
     * 
     * @return a {@link SharedDataComResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("e95c9de9-bcb0-44c1-8147-fd9940a429d4")
    public static SharedDataComResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceLifeline.STEREOTYPE_NAME);
        return SharedDataComResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceLifeline} proxy from a {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SharedDataComResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("0388c24e-19b1-4dd7-a8c0-8911794746ed")
    public static SharedDataComResourceLifeline instantiate(final Lifeline obj) {
        return SharedDataComResourceLifeline.canInstantiate(obj) ? new SharedDataComResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceLifeline} proxy from a {@link Lifeline} stereotyped << SharedDataComResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SharedDataComResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("95ab83c3-258a-4683-b247-e33a0b3f537a")
    public static SharedDataComResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SharedDataComResourceLifeline.canInstantiate(obj))
        	return new SharedDataComResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f9da9d4a-23ad-4de8-91ee-19c70c6d7eeb")
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
        SharedDataComResourceLifeline other = (SharedDataComResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("23da40d5-3f3b-41f5-89ae-3c3df0e63368")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Lifeline_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1e821193-adee-4cd1-84fc-76b5ecb01492")
    public List<String> getSharedDataComResource_Lifeline_readServices() {
        return this.elt.getTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Lifeline_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d83d37bf-6d81-478a-9c8e-8894f4a6526b")
    public List<String> getSharedDataComResource_Lifeline_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("3303e399-145a-471a-ada4-2e6e83baffc4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Lifeline_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1bafaeb5-f655-4b80-a482-f3982b11a008")
    public void setSharedDataComResource_Lifeline_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Lifeline_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("96c5e2cf-54d4-48c2-a3d8-f497e6276646")
    public void setSharedDataComResource_Lifeline_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceLifeline.MdaTypes.SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("bc2c9ad3-bc10-499d-ab0a-f10f67b75a09")
    protected SharedDataComResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("2a274b08-7458-40e4-9e4f-0a6bffae7774")
    public static final class MdaTypes {
        @objid ("f3d70a53-8aca-4a7c-9160-277ac164a9ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d541359e-ad3b-42e1-be95-db4dade50f73")
        public static TagType SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT;

        @objid ("7257c326-4b2e-47dd-bbb3-0b90f2f8a931")
        public static TagType SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT;

        @objid ("5a07129d-ca4d-461f-b20a-c68a1a46ea0f")
        private static Stereotype MDAASSOCDEP;

        @objid ("173a6d71-9593-49f1-ba0f-2c0f8cb3b7cb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("03cca3c7-a41e-4c1f-bb81-9b15822afdb2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2da741a4-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_LIFELINE_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2da741a5-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_LIFELINE_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2da741a6-10d8-11df-81d9-0014222a9f79");
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
