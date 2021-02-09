/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend.GaExecHostAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SaExecHost_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaExecHostAssociationEnd extends GaExecHostAssociationEnd {
    public static final String STEREOTYPE_NAME = "SaExecHost_AssociationEnd";

    public static final String SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE_TAGTYPE = "SaExecHost_AssociationEnd_ISRprioRange";

    public static final String SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT_TAGTYPE = "SaExecHost_AssociationEnd_ISRswitchT";

    public static final String SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE = "SaExecHost_AssociationEnd_isSched";

    public static final String SAEXECHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE = "SaExecHost_AssociationEnd_schSlack";

    public static final String SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ_TAGTYPE = "SaExecHost_AssociationEnd_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SaExecHost_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SaExecHost_AssociationEnd >> then instantiate a {@link SaExecHostAssociationEnd} proxy.
     * 
     * @return a {@link SaExecHostAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static SaExecHostAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostAssociationEnd.STEREOTYPE_NAME);
        return SaExecHostAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SaExecHost_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SaExecHostAssociationEnd} proxy or <i>null</i>.
     */
    public static SaExecHostAssociationEnd instantiate(final AssociationEnd obj) {
        return SaExecHostAssociationEnd.canInstantiate(obj) ? new SaExecHostAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SaExecHost_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SaExecHostAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaExecHostAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SaExecHostAssociationEnd.canInstantiate(obj))
        	return new SaExecHostAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SaExecHostAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        SaExecHostAssociationEnd other = (SaExecHostAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_AssociationEnd_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_AssociationEnd_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_AssociationEnd_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_AssociationEnd_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_AssociationEnd_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_AssociationEnd_schSlack() {
        return this.elt.getTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_AssociationEnd_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaExecHost_AssociationEnd_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_AssociationEnd_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaExecHost_AssociationEnd_isSched() {
        return this.elt.isTagged(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_AssociationEnd_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_AssociationEnd_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_AssociationEnd_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_AssociationEnd_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_AssociationEnd_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_AssociationEnd_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_AssociationEnd_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_AssociationEnd_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_AssociationEnd_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaExecHost_AssociationEnd_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostAssociationEnd.MdaTypes.SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    protected SaExecHostAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT;

        public static TagType SAEXECHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT;

        public static TagType SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ_TAGTYPE_ELT;

        public static TagType SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT_TAGTYPE_ELT;

        public static TagType SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03a156e9-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ASSOCIATIONEND_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b93b-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ASSOCIATIONEND_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b942-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ASSOCIATIONEND_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b949-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ASSOCIATIONEND_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b950-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_ASSOCIATIONEND_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b957-0ccf-11df-8525-001302895b2b");
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
