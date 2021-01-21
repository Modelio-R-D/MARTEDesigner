/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SharedDataComResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e808cb00-9e19-432a-b911-8cfdb4b304e6")
public class SharedDataComResourceAssociationEnd extends SwCommunicationResourceAssociationEnd {
    @objid ("3ffbd7e3-aef9-4597-aee3-6b5830bf1f1c")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_AssociationEnd";

    @objid ("e4164102-7226-4d3f-b7a4-1beaed132198")
    public static final String SHAREDDATACOMRESOURCE_ASSOCIATIONEND_READSERVICES_TAGTYPE = "SharedDataComResource_AssociationEnd_readServices";

    @objid ("9cda3d5c-2ca7-468f-9434-a2529bead925")
    public static final String SHAREDDATACOMRESOURCE_ASSOCIATIONEND_WRITESERVICES_TAGTYPE = "SharedDataComResource_AssociationEnd_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SharedDataComResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b79faa5d-1f01-46ef-995f-4a685c423d58")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SharedDataComResource_AssociationEnd >> then instantiate a {@link SharedDataComResourceAssociationEnd} proxy.
     * 
     * @return a {@link SharedDataComResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("02914de1-0916-485f-bf44-a0320f83d3db")
    public static SharedDataComResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAssociationEnd.STEREOTYPE_NAME);
        return SharedDataComResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SharedDataComResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SharedDataComResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("a797fc44-7310-4b8e-8df2-9efa55256d91")
    public static SharedDataComResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SharedDataComResourceAssociationEnd.canInstantiate(obj) ? new SharedDataComResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SharedDataComResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SharedDataComResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ab9b3c0e-fcd9-4c90-b23f-4269174ffd21")
    public static SharedDataComResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SharedDataComResourceAssociationEnd.canInstantiate(obj))
        	return new SharedDataComResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f16efb2d-3eeb-4d14-85fc-255fba4b8caa")
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
        SharedDataComResourceAssociationEnd other = (SharedDataComResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("c981be67-7158-49a5-bd62-31ab0dbad6d9")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_AssociationEnd_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("91687b86-7bd0-4460-aab9-b8bd51ba6828")
    public List<String> getSharedDataComResource_AssociationEnd_readServices() {
        return this.elt.getTagValues(SharedDataComResourceAssociationEnd.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_AssociationEnd_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("327ee09a-5bb7-450c-b4f6-14c1a0844707")
    public List<String> getSharedDataComResource_AssociationEnd_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceAssociationEnd.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("5bddd933-7f2c-4b92-b934-ad72580568bd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_AssociationEnd_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bd310a70-d5d2-4727-86c0-af9c39b1e590")
    public void setSharedDataComResource_AssociationEnd_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAssociationEnd.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_AssociationEnd_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("43b98137-9287-4149-a686-785daf7f8f5f")
    public void setSharedDataComResource_AssociationEnd_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAssociationEnd.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("d1c29b06-daf3-4b6f-8f8c-9c53d311fed5")
    protected SharedDataComResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("0e725a18-75e2-4ec3-826c-de35445a90ee")
    public static final class MdaTypes {
        @objid ("a23080de-f7b2-4e06-a9ee-b43029698737")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c5d1b4f4-3254-4005-963f-6d36b9b2f19e")
        public static TagType SHAREDDATACOMRESOURCE_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT;

        @objid ("8f9c49c5-fd7b-409f-901a-1ed6d881ca2a")
        public static TagType SHAREDDATACOMRESOURCE_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT;

        @objid ("6a9159bb-aaf6-4c54-ac4c-242171291203")
        private static Stereotype MDAASSOCDEP;

        @objid ("98d1633e-d990-4eb1-b207-7bbe94c90c8d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e0b37180-1ac5-4a3a-b193-fd887f8aa061")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02218156-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_ASSOCIATIONEND_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0221815d-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_ASSOCIATIONEND_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02218164-0ccf-11df-8525-001302895b2b");
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
