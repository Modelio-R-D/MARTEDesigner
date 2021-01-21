/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
 * Proxy class to handle a {@link AssociationEnd} with << SchedulableResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e6ee0c68-f500-454c-a681-f2ff28d3731d")
public class SchedulableResourceAssociationEnd extends ResourceAssociationEnd {
    @objid ("0e63b3eb-b5e8-4cc8-bcd6-cae10710edb0")
    public static final String STEREOTYPE_NAME = "SchedulableResource_AssociationEnd";

    @objid ("03f61426-9a55-49ca-b2d9-ec8143aa1504")
    public static final String SCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_AssociationEnd_dependentScheduler";

    @objid ("9bd06130-5c58-46c8-919c-56810a4fae20")
    public static final String SCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE = "SchedulableResource_AssociationEnd_host";

    @objid ("a8ac3d04-896f-4639-a665-ded261241a41")
    public static final String SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE = "SchedulableResource_AssociationEnd_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SchedulableResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8dc26939-448e-4d0b-a0d8-ab01b47348a7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SchedulableResource_AssociationEnd >> then instantiate a {@link SchedulableResourceAssociationEnd} proxy.
     * 
     * @return a {@link SchedulableResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("8e60418f-8464-495f-8939-12fc1aab5e5a")
    public static SchedulableResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceAssociationEnd.STEREOTYPE_NAME);
        return SchedulableResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SchedulableResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SchedulableResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("3f828d4f-2c9c-42d4-88a9-86853e155b6a")
    public static SchedulableResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SchedulableResourceAssociationEnd.canInstantiate(obj) ? new SchedulableResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SchedulableResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SchedulableResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("24b98059-a596-4ee4-ad10-23f89644686f")
    public static SchedulableResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SchedulableResourceAssociationEnd.canInstantiate(obj))
        	return new SchedulableResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dcf4c08b-a00d-4736-9518-0cececf27158")
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
        SchedulableResourceAssociationEnd other = (SchedulableResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("c721971d-7681-4795-ad25-b4aeb0623239")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_AssociationEnd_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac292e98-1740-4687-9b07-0b6333c46192")
    public String getSchedulableResource_AssociationEnd_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceAssociationEnd.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cec69424-5bca-4015-9f47-6e1db97d2fb1")
    public String getSchedulableResource_AssociationEnd_host() {
        return this.elt.getTagValue(SchedulableResourceAssociationEnd.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_AssociationEnd_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9bd5fa7e-a0b5-4d0b-aa98-8bd266b36f24")
    public List<String> getSchedulableResource_AssociationEnd_schedParams() {
        return this.elt.getTagValues(SchedulableResourceAssociationEnd.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @objid ("5f4799d0-7175-4c1f-9556-4324aa88c419")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_AssociationEnd_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac62aab3-ff15-41f4-a924-d1dc1af9183f")
    public void setSchedulableResource_AssociationEnd_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceAssociationEnd.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_AssociationEnd_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d68fd687-8daa-4bbf-973a-16b59210f2c8")
    public void setSchedulableResource_AssociationEnd_host(final String value) {
        this.elt.putTagValue(SchedulableResourceAssociationEnd.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_AssociationEnd_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1ee90a4-7ce2-4dce-935c-7e2c71370271")
    public void setSchedulableResource_AssociationEnd_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceAssociationEnd.MdaTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    @objid ("325d3711-324f-4758-8f4d-1f39411bbb57")
    protected SchedulableResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("2035f116-4cf3-44ae-92ee-41c7a9e0a092")
    public static final class MdaTypes {
        @objid ("e9dbaeaa-a2e8-44ce-86d6-f88235270063")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0e66534f-33c1-4aee-a011-058fb58c0e0e")
        public static TagType SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("ce5ed698-000a-4190-9442-2fac0d4b5940")
        public static TagType SCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT;

        @objid ("7ef13abb-26f7-4eef-8c43-fdccb5a4933b")
        public static TagType SCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("9786b5aa-cdfa-4914-aff1-99eae2855007")
        private static Stereotype MDAASSOCDEP;

        @objid ("b87d85e8-8020-4fe0-bf82-dad0f1280e2e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c2ab4025-5572-4d65-bbae-c61cf8ae0c62")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "008e9934-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "008e993b-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_ASSOCIATIONEND_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb8c-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb93-0ccf-11df-8525-001302895b2b");
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
