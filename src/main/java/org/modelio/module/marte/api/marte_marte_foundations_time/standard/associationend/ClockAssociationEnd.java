/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.associationend;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << Clock_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("29dc36a0-5401-4de1-8c19-6b8fda011bbf")
public class ClockAssociationEnd {
    @objid ("48792637-12fe-4406-b34b-42d9d44d4026")
    public static final String STEREOTYPE_NAME = "Clock_AssociationEnd";

    @objid ("d91f60e2-73f0-4723-8b37-8977d01157a9")
    public static final String CLOCK_ASSOCIATIONEND_STANDARD_TAGTYPE = "Clock_AssociationEnd_standard";

    @objid ("b91d894c-1499-4cd5-8dc3-d7dede7d038d")
    public static final String CLOCK_ASSOCIATIONEND_TYPE_TAGTYPE = "Clock_AssociationEnd_type";

    @objid ("1861368e-d2da-4532-82ea-4ed6a586f7c6")
    public static final String CLOCK_ASSOCIATIONEND_UNIT_TAGTYPE = "Clock_AssociationEnd_unit";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("84bbef05-5b14-4cb3-834e-e7201bc38c95")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link ClockAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << Clock_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5b5c871b-2430-4e19-a1f1-5b6a901fd51d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << Clock_AssociationEnd >> then instantiate a {@link ClockAssociationEnd} proxy.
     * 
     * @return a {@link ClockAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("13f2aeea-9e8c-4af4-95cc-bf0e0144b08f")
    public static ClockAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockAssociationEnd.STEREOTYPE_NAME);
        return ClockAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link ClockAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Clock_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link ClockAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("7e07e766-ab3f-412d-976f-8e8fd0d5ae18")
    public static ClockAssociationEnd instantiate(final AssociationEnd obj) {
        return ClockAssociationEnd.canInstantiate(obj) ? new ClockAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << Clock_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link ClockAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7a581c2f-1091-40c5-903d-f016f2214e64")
    public static ClockAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (ClockAssociationEnd.canInstantiate(obj))
        	return new ClockAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("ClockAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e216fa79-6407-4bb4-aefa-2654533e4e9e")
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
        ClockAssociationEnd other = (ClockAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Clock_AssociationEnd_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("613bfe2c-757d-428c-809d-bf8f28123558")
    public String getClock_AssociationEnd_standard() {
        return this.elt.getTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e7fd1e5-aea3-4305-b9e0-9b0911a45a61")
    public String getClock_AssociationEnd_type() {
        return this.elt.getTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_AssociationEnd_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aae34ef8-4a62-4c28-b59c-c2c6584a78e6")
    public String getClock_AssociationEnd_unit() {
        return this.elt.getTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("e61c6438-aa57-4223-a3fe-675a39806550")
    public AssociationEnd getElement() {
        return this.elt;
    }

    @objid ("326f3a5c-2e19-4aa3-b8c5-a7d451328274")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_AssociationEnd_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2164d846-2ec0-493b-b7b0-d3739725a56f")
    public void setClock_AssociationEnd_standard(final String value) {
        this.elt.putTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea5ebf01-c92b-4008-b821-c438b350d4cc")
    public void setClock_AssociationEnd_type(final String value) {
        this.elt.putTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_AssociationEnd_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d392c0d9-da69-42d2-a5ad-6371648851bd")
    public void setClock_AssociationEnd_unit(final String value) {
        this.elt.putTagValue(ClockAssociationEnd.MdaTypes.CLOCK_ASSOCIATIONEND_UNIT_TAGTYPE_ELT, value);
    }

    @objid ("1395dc0c-ee80-4fee-88e9-073b53212bc0")
    protected ClockAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("742f00da-a12f-4407-b2dd-a73b6b67dcd1")
    public static final class MdaTypes {
        @objid ("97393750-8397-43c8-8146-c0e9fcf9949b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dc8eccd3-8c1c-458e-80a6-b2824cdfe57d")
        public static TagType CLOCK_ASSOCIATIONEND_STANDARD_TAGTYPE_ELT;

        @objid ("74b929ac-54cb-4b8c-a9c5-0c1c9e2e7073")
        public static TagType CLOCK_ASSOCIATIONEND_TYPE_TAGTYPE_ELT;

        @objid ("ef5e0346-442a-4238-a6ff-83778d73f951")
        public static TagType CLOCK_ASSOCIATIONEND_UNIT_TAGTYPE_ELT;

        @objid ("35ac4d09-a5f9-4b95-9cde-ac0eb577293d")
        private static Stereotype MDAASSOCDEP;

        @objid ("ae84c4f6-654b-4904-8f3a-f7234398d656")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7bb80ff0-9bd0-49cf-bb43-a2d948f28227")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dae30f8b-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATIONEND_STANDARD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae30f92-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATIONEND_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571e1-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATIONEND_UNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571e8-0cce-11df-8525-001302895b2b");
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
