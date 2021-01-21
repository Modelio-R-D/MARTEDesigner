/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend.GaCommHostAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SaCommHost_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1a10a1da-a19d-4bca-b9d5-9a2745eca3dc")
public class SaCommHostAssociationEnd extends GaCommHostAssociationEnd {
    @objid ("837a09d2-74c5-4144-87eb-9715365bddbd")
    public static final String STEREOTYPE_NAME = "SaCommHost_AssociationEnd";

    @objid ("bdbd0649-57c6-443b-b057-cb4bd8926081")
    public static final String SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE = "SaCommHost_AssociationEnd_isSched";

    @objid ("0a9f4c93-035e-44f1-8ce9-904bd50a5b7a")
    public static final String SACOMMHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE = "SaCommHost_AssociationEnd_schSlack";

    /**
     * Tells whether a {@link SaCommHostAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SaCommHost_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("beab4964-feb1-4dc5-bbcc-0d85bf10b08f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SaCommHost_AssociationEnd >> then instantiate a {@link SaCommHostAssociationEnd} proxy.
     * 
     * @return a {@link SaCommHostAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("36ee47ad-cc22-488a-a4f9-1d399cfeb1db")
    public static SaCommHostAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAssociationEnd.STEREOTYPE_NAME);
        return SaCommHostAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SaCommHost_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SaCommHostAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("64c41eda-891e-49db-a1d9-bd1d2d42b8e7")
    public static SaCommHostAssociationEnd instantiate(final AssociationEnd obj) {
        return SaCommHostAssociationEnd.canInstantiate(obj) ? new SaCommHostAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SaCommHost_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SaCommHostAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1e0d6632-a693-4288-8298-952076fc7b93")
    public static SaCommHostAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SaCommHostAssociationEnd.canInstantiate(obj))
        	return new SaCommHostAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SaCommHostAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3d7463d1-9db6-494f-aaaa-3c0e301b6750")
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
        SaCommHostAssociationEnd other = (SaCommHostAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("0dead547-0fe7-4011-8e47-d794ab194f99")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'SaCommHost_AssociationEnd_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd868c9c-3994-484d-8b2a-076d5c2530ba")
    public String getSaCommHost_AssociationEnd_schSlack() {
        return this.elt.getTagValue(SaCommHostAssociationEnd.MdaTypes.SACOMMHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT);
    }

    @objid ("a68b100c-86f1-4d50-a1e1-c675b266dcf1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_AssociationEnd_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6f609536-55f6-4bcc-a4eb-c6d15169d3f9")
    public boolean isSaCommHost_AssociationEnd_isSched() {
        return this.elt.isTagged(SaCommHostAssociationEnd.MdaTypes.SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_AssociationEnd_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d30419b6-d7b6-4a25-a055-133987823e31")
    public void setSaCommHost_AssociationEnd_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostAssociationEnd.MdaTypes.SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostAssociationEnd.MdaTypes.SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_AssociationEnd_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb04a7f6-695a-411e-be26-19cca64092f2")
    public void setSaCommHost_AssociationEnd_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostAssociationEnd.MdaTypes.SACOMMHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT, value);
    }

    @objid ("50182bbe-bb36-4e6b-a2ee-fec6a4c60ea2")
    protected SaCommHostAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("88030503-a182-4b85-ba0e-e0f5cb48512a")
    public static final class MdaTypes {
        @objid ("fab776b5-97a7-45cf-8dc0-3fe87b898a0b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2a0298ef-fc15-48f1-8c24-0998bcc16e35")
        public static TagType SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT;

        @objid ("c46990ff-1e44-4b17-98cd-98dc9f161520")
        public static TagType SACOMMHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT;

        @objid ("086afd72-563b-4d46-a9b9-23e5c0114f9f")
        private static Stereotype MDAASSOCDEP;

        @objid ("57649552-9264-45e1-9c8f-345b5c39a45f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("33e003e2-d37b-4000-9e47-45d73cdff044")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "039c9245-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c924c-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9253-0ccf-11df-8525-001302895b2b");
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
